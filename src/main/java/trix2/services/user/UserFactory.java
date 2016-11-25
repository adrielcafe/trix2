//package trix2.services.user;
//
//import trix2.models.custom.UserGrantedAuthority;
//import trix2.repositories.UserRepository;
//import org.springframework.stereotype.Service;
//
////@IntegrationTestBean
//@Service
//public class UserFactory {
//
//	private UserRepository userRepository;
////	private NetworkRepository networkRepository;
////	private UserConnectionFactory userConnectionFactory;
////	private UserGrantedAuthorityRepository grantedAuthorityRepository;
//
//	public UserFactory(UserRepository userRepository) {
//		this.userRepository = userRepository;
//	}
//
////	@Autowired
////	public UserFactory(UserRepository userRepository, UserConnectionFactory userConnectionFactory, UserGrantedAuthorityRepository grantedAuthorityRepository, NetworkRepository networkRepository) {
////		this.userRepository = userRepository;
////		this.userConnectionFactory = userConnectionFactory;
////		this.grantedAuthorityRepository = grantedAuthorityRepository;
////		this.networkRepository = networkRepository;
////	}
//
//	public User create(String username, String password) throws UserAlreadyExistsException {
//		if(userRepository.findByUsername(username) != null) {
//			throw new UserAlreadyExistsException();
//		}
//
////		String tenantId = TenantContextHolder.getCurrentTenantId();
////		Network network = networkRepository.findByTenantId(tenantId);
////
//		User user = new User();
////		user.enabled = !network.isEmailSignUpValidationEnabled();
////		user.username = username;
////		user.password = password;
//
//		UserGrantedAuthority authority = new UserGrantedAuthority(user, UserGrantedAuthority.USER_AUTHORITY);
////		grantedAuthorityRepository.save(authority);
//
//		user.addAuthority(authority);
//		user = userRepository.save(user);
//
//		return user;
//	}
//
////	public UserConnection createConnection(User user, SocialUser socialUser) {
////		return userConnectionFactory.create(user, socialUser);
////	}
//
////	public String generateUsernameFromName(String name) {
////		int i = 1;
////		String originalUsername = name.toLowerCase().replace(" ", "");
////		originalUsername = Normalizer.normalize(originalUsername, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
////		String username = originalUsername;
////		while (userRepository.existsByUsername(username)) {
////			username = originalUsername + i++;
////		}
////		return username;
////	}
//
//	public void delete(String username) {
//		User user  = userRepository.findByUsername(username);
//		if(user != null) {
////			grantedAuthorityRepository.deleteByUserId(user.id);
//			userRepository.delete(user);
//		}
//
//	}
//}
