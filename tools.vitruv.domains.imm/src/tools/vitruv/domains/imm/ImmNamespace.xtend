package tools.vitruv.domains.imm

import edu.kit.ipd.sdq.imm.ImmPackage
import org.eclipse.emf.ecore.EPackage

final class ImmNamespace {
	
	private new() {
	}
	
	// file extensions
	public static final String FILE_EXTENSION = "imm";
	
	// Test Namespaces
	public static final EPackage ROOT_PACKAGE = ImmPackage.eINSTANCE;
	public static final String METAMODEL_NAMESPACE = ImmPackage.eNS_URI;
	
}