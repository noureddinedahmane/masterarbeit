package tools.vitruv.domains.mmm

import tools.vitruv.framework.domains.AbstractVitruvDomain
import tools.vitruv.domains.emf.builder.VitruviusEmfBuilderApplicator
import tools.vitruv.framework.tuid.TuidCalculatorAndResolver
import tools.vitruv.framework.tuid.AttributeTuidCalculatorAndResolver
import edu.kit.ipd.sdq.mmm.MmmPackage

class MmmDomain extends AbstractVitruvDomain{
	
	public static final String METAMODEL_NAME = "MMM";
	
	package new() {
		super(METAMODEL_NAME, MmmNamespace.ROOT_PACKAGE, generateTuidCalculator(), MmmNamespace.FILE_EXTENSION);
	}
	
	def protected static TuidCalculatorAndResolver generateTuidCalculator() {
		return new AttributeTuidCalculatorAndResolver(MmmNamespace.METAMODEL_NAMESPACE, 
			#[MmmPackage.eINSTANCE.name]
		);
	}
	
	override getBuilderApplicator() {
		return new VitruviusEmfBuilderApplicator();
	}
}