package tools.vitruv.applications.pcmjava.monitoringdataintegration;
import java.io.FileNotFoundException;
import java.util.List;

import org.eclipse.emf.ecore.resource.Resource;

public interface MonitoringDataIntegration {

	 String ID = "tools.vitruv.applications.pcmjava.monitoringdataintegration.monitoringdataintegration";
	 
	 public List<Resource> createResourceFromCSVFile(String csvPath) throws FileNotFoundException;
	 
}
