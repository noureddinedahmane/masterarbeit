package sourcecode.instrumentation.instrumentationhelper;

import java.util.UUID;

public class SourceCodeInstrumentationHelper {
	

	public static String getUUID() {
		 UUID uuid = UUID.randomUUID();
		 return uuid.toString();
	}
	

}
