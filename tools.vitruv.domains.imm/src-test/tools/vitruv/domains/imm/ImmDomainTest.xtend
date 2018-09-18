package tools.vitruv.domains.imm

import org.junit.Before
import tools.vitruv.framework.tuid.TuidManager
import org.junit.Test
import edu.kit.ipd.sdq.imm.ImmFactory
import org.junit.Assert

class ImmDomainTest {
	
	private static val TEST_NAME = "Test";
	private var ImmDomain immDomain;
	
	
	@Before
	public def void setup() {
		TuidManager.instance.reinitialize();
		immDomain = new ImmDomainProvider().domain;
	}
	
	@Test
	public def void testResponsibilityChecks() {

		val clazz = ImmFactory.eINSTANCE.createProbe();
	
		Assert.assertTrue(immDomain.isInstanceOfDomainMetamodel(clazz));
		Assert.assertTrue(immDomain.calculateTuid(clazz) !== null);
	
	}
	
	
}