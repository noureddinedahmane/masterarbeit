package tools.vitruv.domains.mmm;

import tools.vitruv.domains.mmm.MmmDomain;
import tools.vitruv.framework.domains.VitruvDomainProvider;

@SuppressWarnings("all")
public class MmmDomainProvider implements VitruvDomainProvider<MmmDomain> {
  private static MmmDomain instance;
  
  @Override
  public MmmDomain getDomain() {
    if ((MmmDomainProvider.instance == null)) {
      MmmDomain _mmmDomain = new MmmDomain();
      MmmDomainProvider.instance = _mmmDomain;
    }
    return MmmDomainProvider.instance;
  }
}
