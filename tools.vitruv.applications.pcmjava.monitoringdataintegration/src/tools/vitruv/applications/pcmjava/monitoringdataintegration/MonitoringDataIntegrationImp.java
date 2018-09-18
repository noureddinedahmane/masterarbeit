package tools.vitruv.applications.pcmjava.monitoringdataintegration;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.eclipse.emf.ecore.resource.Resource;

public class MonitoringDataIntegrationImp implements MonitoringDataIntegration{
	
	// the values of these params will be exchanged by vitruv default values 
	private static final char DEFAULT_SEPARATOR = ','; 
    private static final char DEFAULT_QUOTE = '"';
    

	@Override
	public List<Resource> createResourceFromCSVFile(String csvPath) throws FileNotFoundException {
		
		Scanner scanner = new Scanner(new File(csvPath));
		
		while (scanner.hasNext()) {
            List<String> line = parseLine(scanner.nextLine());
            /* The first value in csv file line represents the type of the prove
             * many probes to support:
	             * ia: Internal action
	             * op: Operation
	             * lpa: loop action
	             * bra: branch action
             */
            
            /*
             ia,id,103994
             op,id, [a = 12, 2.00, ], [] 
  
            /*
             
             */
            String probeType = line.get(0);
            if(probeType.equals("ia")) {
            	
            }
            else if(probeType.equals("op")) {
            	
            }
            else if(probeType.equals("lpa")) {
            	
            }
            else if(probeType.equals("bra")) {
            	
            }
        }
        scanner.close();
		
		return null;
	}
	
	
	private List<String> parseLine(String cvsLine) {
        return parseLine(cvsLine, DEFAULT_SEPARATOR, DEFAULT_QUOTE);
    }

    private List<String> parseLine(String cvsLine, char separators) {
        return parseLine(cvsLine, separators, DEFAULT_QUOTE);
    }

    
    // parse every line in the file taking in account different line properties
    private List<String> parseLine(String cvsLine, char separators, char customQuote) {

        List<String> result = new ArrayList<>();

        //if empty, return!
        if (cvsLine == null && cvsLine.isEmpty()) {
            return result;
        }

        if (customQuote == ' ') {
            customQuote = DEFAULT_QUOTE;
        }

        if (separators == ' ') {
            separators = DEFAULT_SEPARATOR;
        }

        StringBuffer curVal = new StringBuffer();
        boolean inQuotes = false;
        boolean startCollectChar = false;
        boolean doubleQuotesInColumn = false;

        char[] chars = cvsLine.toCharArray();

        for (char ch : chars) {

            if (inQuotes) {
                startCollectChar = true;
                if (ch == customQuote) {
                    inQuotes = false;
                    doubleQuotesInColumn = false;
                } else {

                    //Fixed : allow "" in custom quote enclosed
                    if (ch == '\"') {
                        if (!doubleQuotesInColumn) {
                            curVal.append(ch);
                            doubleQuotesInColumn = true;
                        }
                    } else {
                        curVal.append(ch);
                    }

                }
            } else {
                if (ch == customQuote) {

                    inQuotes = true;

                    //Fixed : allow "" in empty quote enclosed
                    if (chars[0] != '"' && customQuote == '\"') {
                        curVal.append('"');
                    }

                    //double quotes in column will hit this!
                    if (startCollectChar) {
                        curVal.append('"');
                    }

                } else if (ch == separators) {

                    result.add(curVal.toString());

                    curVal = new StringBuffer();
                    startCollectChar = false;

                } else if (ch == '\r') {
                    //ignore LF characters
                    continue;
                } else if (ch == '\n') {
                    //the end, break!
                    break;
                } else {
                    curVal.append(ch);
                }
            }

        }

        result.add(curVal.toString());

        return result;
    }
    
    
    

}


