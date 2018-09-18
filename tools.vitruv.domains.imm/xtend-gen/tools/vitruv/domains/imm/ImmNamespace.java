package tools.vitruv.domains.imm;

import edu.kit.ipd.sdq.imm.ImmPackage;
import org.eclipse.emf.ecore.EPackage;

@SuppressWarnings("all")
public final class ImmNamespace {
  private ImmNamespace() {
  }
  
  public final static String FILE_EXTENSION = "imm";
  
  public final static EPackage ROOT_PACKAGE = ImmPackage.eINSTANCE;
  
  public final static String METAMODEL_NAMESPACE = ImmPackage.eNS_URI;
}
