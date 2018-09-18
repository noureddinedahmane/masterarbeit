package tools.vitruv.domains.imm

import tools.vitruv.framework.domains.VitruvDomainProvider

class ImmDomainProvider  implements VitruvDomainProvider<ImmDomain>{

    private static var ImmDomain instance;
	
	override getDomain() {
		if (instance === null) {
			instance = new ImmDomain();
		}
		return instance;
	}
		
}