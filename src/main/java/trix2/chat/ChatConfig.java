package trix2.chat;

import trix2.chat.domain.SessionProfanity;
import trix2.chat.event.ParticipantRepository;
import trix2.chat.event.PresenceEventListener;
import trix2.chat.util.ProfanityChecker;
import org.springframework.boot.actuate.endpoint.MessageMappingEndpoint;
import org.springframework.boot.actuate.endpoint.WebSocketEndpoint;
import org.springframework.context.annotation.*;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.socket.config.WebSocketMessageBrokerStats;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@Configuration
public class ChatConfig {

	public static class Destinations {
		private Destinations() {
		}

		private static final String LOGIN = "/topic/chat.login";
		private static final String LOGOUT = "/topic/chat.logout";
	}

	private static final int MAX_PROFANITY_LEVEL = 5;

	/*
	 * @Bean
	 * 
	 * @Description("Application event multicaster to process events asynchonously"
	 * ) public ApplicationEventMulticaster applicationEventMulticaster() {
	 * SimpleApplicationEventMulticaster multicaster = new
	 * SimpleApplicationEventMulticaster();
	 * multicaster.setTaskExecutor(Executors.newFixedThreadPool(10)); return
	 * multicaster; }
	 */
	@Bean
	@Description("Tracks user presence (join / leave) and broacasts it to all connected users")
	public PresenceEventListener presenceEventListener(SimpMessagingTemplate messagingTemplate) {
		PresenceEventListener presence = new PresenceEventListener(messagingTemplate, participantRepository());
		presence.setLoginDestination(Destinations.LOGIN);
		presence.setLogoutDestination(Destinations.LOGOUT);
		return presence;
	}

	@Bean
	@Description("Keeps connected users")
	public ParticipantRepository participantRepository() {
		return new ParticipantRepository();
	}

	@Bean
	@Scope(value = "websocket", proxyMode = ScopedProxyMode.TARGET_CLASS)
	@Description("Keeps track of the level of profanity of a websocket session")
	public SessionProfanity sessionProfanity() {
		return new SessionProfanity(MAX_PROFANITY_LEVEL);
	}

	@Bean
	@Description("Utility class to check the number of profanities and filter them")
	public ProfanityChecker profanityFilter() {
		Set<String> profanities = new HashSet<>(Arrays.asList("damn", "crap", "ass"));
		ProfanityChecker checker = new ProfanityChecker();
		checker.setProfanities(profanities);
		return checker;
	}
	
	@Bean
	@Description("Spring Actuator endpoint to expose WebSocket stats")
	public WebSocketEndpoint websocketEndpoint(WebSocketMessageBrokerStats stats) {
		return new WebSocketEndpoint(stats);
	}
	
	@Bean
	@Description("Spring Actuator endpoint to expose WebSocket message mappings")
	public MessageMappingEndpoint messageMappingEndpoint() {
		return new MessageMappingEndpoint();
	}
}