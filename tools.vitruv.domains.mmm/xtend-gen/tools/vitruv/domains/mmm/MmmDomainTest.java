package tools.vitruv.domains.mmm;

import edu.kit.ipd.sdq.mmm.MmmFactory;
import edu.kit.ipd.sdq.mmm.Operation;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import tools.vitruv.domains.mmm.MmmDomain;
import tools.vitruv.domains.mmm.MmmDomainProvider;
import tools.vitruv.framework.tuid.Tuid;
import tools.vitruv.framework.tuid.TuidManager;

@SuppressWarnings("all")
public class MmmDomainTest {
  private final static String TEST_NAME = "Test";
  
  private MmmDomain mmmDomain;
  
  @Before
  public void setup() {
    TuidManager.getInstance().reinitialize();
    this.mmmDomain = new MmmDomainProvider().getDomain();
  }
  
  @Test
  public void testResponsibilityChecks() {
    final Operation clazz = MmmFactory.eINSTANCE.createOperation();
    Assert.assertTrue(this.mmmDomain.isInstanceOfDomainMetamodel(clazz));
    Tuid _calculateTuid = this.mmmDomain.calculateTuid(clazz);
    boolean _tripleNotEquals = (_calculateTuid != null);
    Assert.assertTrue(_tripleNotEquals);
  }
}
