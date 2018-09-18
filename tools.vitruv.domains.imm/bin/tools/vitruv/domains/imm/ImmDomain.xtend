package tools.vitruv.domains.imm

import tools.vitruv.framework.domains.AbstractVitruvDomain
import tools.vitruv.framework.tuid.TuidCalculatorAndResolver
import tools.vitruv.framework.tuid.AttributeTuidCalculatorAndResolver
import edu.kit.ipd.sdq.imm.ImmPackage
import tools.vitruv.domains.emf.builder.VitruviusEmfBuilderApplicator

class ImmDomain extends AbstractVitruvDomain{
	
	public static final String METAMODEL_NAME = "IMM";
	
	package new() {
		super(METAMODEL_NAME, ImmNamespace.ROOT_PACKAGE, generateTuidCalculator(), ImmNamespace.FILE_EXTENSION);
	}
	
	def protected static TuidCalculatorAndResolver generateTuidCalculator() {
		return new AttributeTuidCalculatorAndResolver(ImmNamespace.METAMODEL_NAMESPACE, 
			#[ImmPackage.eINSTANCE.name]
		);
	}
	
	override getBuilderApplicator() {
		return new VitruviusEmfBuilderApplicator();
	}
	
}