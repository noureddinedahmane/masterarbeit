package tools.vitruv.domains.mmm;

import edu.kit.ipd.sdq.mmm.MmmPackage;
import java.util.Collections;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import tools.vitruv.domains.emf.builder.VitruviusEmfBuilderApplicator;
import tools.vitruv.domains.mmm.MmmNamespace;
import tools.vitruv.framework.domains.AbstractVitruvDomain;
import tools.vitruv.framework.domains.VitruviusProjectBuilderApplicator;
import tools.vitruv.framework.tuid.AttributeTuidCalculatorAndResolver;
import tools.vitruv.framework.tuid.TuidCalculatorAndResolver;

@SuppressWarnings("all")
public class MmmDomain extends AbstractVitruvDomain {
  public final static String METAMODEL_NAME = "MMM";
  
  MmmDomain() {
    super(MmmDomain.METAMODEL_NAME, MmmNamespace.ROOT_PACKAGE, MmmDomain.generateTuidCalculator(), MmmNamespace.FILE_EXTENSION);
  }
  
  protected static TuidCalculatorAndResolver generateTuidCalculator() {
    String _name = MmmPackage.eINSTANCE.getName();
    return new AttributeTuidCalculatorAndResolver(MmmNamespace.METAMODEL_NAMESPACE, 
      Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList(_name)));
  }
  
  @Override
  public VitruviusProjectBuilderApplicator getBuilderApplicator() {
    return new VitruviusEmfBuilderApplicator();
  }
}
