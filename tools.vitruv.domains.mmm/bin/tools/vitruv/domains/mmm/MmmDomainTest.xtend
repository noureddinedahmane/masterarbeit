package tools.vitruv.domains.mmm

import org.junit.Before
import tools.vitruv.framework.tuid.TuidManager
import org.junit.Test
import edu.kit.ipd.sdq.mmm.MmmFactory
import org.junit.Assert

class MmmDomainTest {
	
	private static val TEST_NAME = "Test";
	private var MmmDomain mmmDomain;
	
	
	@Before
	public def void setup() {
		TuidManager.instance.reinitialize();
		mmmDomain = new MmmDomainProvider().domain;
	}
	
	
	@Test
	public def void testResponsibilityChecks() {

		val clazz = MmmFactory.eINSTANCE.createOperation();
	
		Assert.assertTrue(mmmDomain.isInstanceOfDomainMetamodel(clazz));
		Assert.assertTrue(mmmDomain.calculateTuid(clazz) !== null);
	
	}
	
}