package tools.vitruv.domains.imm;

import tools.vitruv.domains.imm.ImmDomain;
import tools.vitruv.framework.domains.VitruvDomainProvider;

@SuppressWarnings("all")
public class ImmDomainProvider implements VitruvDomainProvider<ImmDomain> {
  private static ImmDomain instance;
  
  @Override
  public ImmDomain getDomain() {
    if ((ImmDomainProvider.instance == null)) {
      ImmDomain _immDomain = new ImmDomain();
      ImmDomainProvider.instance = _immDomain;
    }
    return ImmDomainProvider.instance;
  }
}
