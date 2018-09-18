import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
	
		
	}
	
	public static void test(){
		
		/*  test refactoring call */
		
		Map<String, Integer> refactoring_test_maper = refactoring_test();
		int i = refactoring_test_maper.get("i");
		int j = refactoring_test_maper.get("j");
		
		/* end refactoring call */
		
		
		int summe = i + j;
		int sus = j - i;
		
		System.out.println("Summe: " + summe);
		

		
	}
	
	public static Map<String, Integer> refactoring_test(){
		
		int i = 0;
		int j = 1;
		
		
		Map<String, Integer> maper = new HashMap<String, Integer>();
		
		maper.put("i", i);
		maper.put("j", j);
		
		return maper;
	}



}
