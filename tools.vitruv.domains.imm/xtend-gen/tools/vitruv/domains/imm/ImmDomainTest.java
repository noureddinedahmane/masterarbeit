package tools.vitruv.domains.imm;

import edu.kit.ipd.sdq.imm.ImmFactory;
import edu.kit.ipd.sdq.imm.Probe;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import tools.vitruv.domains.imm.ImmDomain;
import tools.vitruv.domains.imm.ImmDomainProvider;
import tools.vitruv.framework.tuid.Tuid;
import tools.vitruv.framework.tuid.TuidManager;

@SuppressWarnings("all")
public class ImmDomainTest {
  private final static String TEST_NAME = "Test";
  
  private ImmDomain immDomain;
  
  @Before
  public void setup() {
    TuidManager.getInstance().reinitialize();
    this.immDomain = new ImmDomainProvider().getDomain();
  }
  
  @Test
  public void testResponsibilityChecks() {
    final Probe clazz = ImmFactory.eINSTANCE.createProbe();
    Assert.assertTrue(this.immDomain.isInstanceOfDomainMetamodel(clazz));
    Tuid _calculateTuid = this.immDomain.calculateTuid(clazz);
    boolean _tripleNotEquals = (_calculateTuid != null);
    Assert.assertTrue(_tripleNotEquals);
  }
}
