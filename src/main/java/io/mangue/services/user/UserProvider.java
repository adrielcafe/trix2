package io.mangue.services.user;

import io.mangue.models.User;
import io.mangue.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

//@IntegrationTestBean
@Service
public class UserProvider implements UserDetailsService {

	private UserRepository userRepository;

	@Autowired
	public UserProvider(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
		User user = userRepository.findByUsername(s);

		if(user == null)
			throw new UsernameNotFoundException("Username doesn't exist");

		return user;
	}
}
