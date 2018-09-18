package tools.vitruv.domains.mmm;

import edu.kit.ipd.sdq.mmm.MmmPackage;
import org.eclipse.emf.ecore.EPackage;

@SuppressWarnings("all")
public final class MmmNamespace {
  private MmmNamespace() {
  }
  
  public final static String FILE_EXTENSION = "mmm";
  
  public final static EPackage ROOT_PACKAGE = MmmPackage.eINSTANCE;
  
  public final static String METAMODEL_NAMESPACE = MmmPackage.eNS_URI;
}
