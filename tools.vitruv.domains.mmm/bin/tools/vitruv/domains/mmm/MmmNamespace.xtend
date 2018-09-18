package tools.vitruv.domains.mmm

import org.eclipse.emf.ecore.EPackage
import edu.kit.ipd.sdq.mmm.MmmPackage

final class MmmNamespace {
	
	private new() {
	}
	
	// file extensions
	public static final String FILE_EXTENSION = "mmm";
	
	
	// Test Namespaces
	public static final EPackage ROOT_PACKAGE = MmmPackage.eINSTANCE;
	public static final String METAMODEL_NAMESPACE = MmmPackage.eNS_URI;
	
}