package tools.vitruv.domains.mmm

import tools.vitruv.framework.domains.VitruvDomainProvider

class MmmDomainProvider implements VitruvDomainProvider<MmmDomain>{
	
	private static var MmmDomain instance;
	
	override getDomain() {
		if (instance === null) {
			instance = new MmmDomain();
		}
		return instance;
	}
	
}