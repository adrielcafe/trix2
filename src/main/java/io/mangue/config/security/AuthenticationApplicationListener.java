package io.mangue.config.security;

import org.springframework.context.ApplicationListener;
import org.springframework.security.authentication.event.InteractiveAuthenticationSuccessEvent;
import org.springframework.stereotype.Component;

@Component
class AuthenticationApplicationListener implements ApplicationListener<InteractiveAuthenticationSuccessEvent> {

//	@Autowired
//	PersonRepository personRepository;

	@Override
	public void onApplicationEvent(InteractiveAuthenticationSuccessEvent event) {
//		String tenantId = TenantContextHolder.getCurrentTenantId();
//		String username = ((User)event.getAuthentication().getPrincipal()).getUsername();
//		Person person = personRepository.findByUsernameAndTenantId(username, tenantId);
//		if (person != null) {
//			person.lastLogin = new Date();
//			personRepository.save(person);
//		}
	}

}