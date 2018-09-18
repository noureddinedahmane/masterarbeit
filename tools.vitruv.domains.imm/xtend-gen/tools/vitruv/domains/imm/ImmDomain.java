package tools.vitruv.domains.imm;

import edu.kit.ipd.sdq.imm.ImmPackage;
import java.util.Collections;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import tools.vitruv.domains.emf.builder.VitruviusEmfBuilderApplicator;
import tools.vitruv.domains.imm.ImmNamespace;
import tools.vitruv.framework.domains.AbstractVitruvDomain;
import tools.vitruv.framework.domains.VitruviusProjectBuilderApplicator;
import tools.vitruv.framework.tuid.AttributeTuidCalculatorAndResolver;
import tools.vitruv.framework.tuid.TuidCalculatorAndResolver;

@SuppressWarnings("all")
public class ImmDomain extends AbstractVitruvDomain {
  public final static String METAMODEL_NAME = "IMM";
  
  ImmDomain() {
    super(ImmDomain.METAMODEL_NAME, ImmNamespace.ROOT_PACKAGE, ImmDomain.generateTuidCalculator(), ImmNamespace.FILE_EXTENSION);
  }
  
  protected static TuidCalculatorAndResolver generateTuidCalculator() {
    String _name = ImmPackage.eINSTANCE.getName();
    return new AttributeTuidCalculatorAndResolver(ImmNamespace.METAMODEL_NAMESPACE, 
      Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList(_name)));
  }
  
  @Override
  public VitruviusProjectBuilderApplicator getBuilderApplicator() {
    return new VitruviusEmfBuilderApplicator();
  }
}
