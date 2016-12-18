package trix2.web.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import trix2.repositories.UserRepository;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by misael on 17/10/2015.
 */
@RestController
@RequestMapping("/api")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ApiController {

	@Autowired
	public UserRepository userRepository;

    @RequestMapping("/test")
    public String test(){
		userRepository.findByUsername("");
        return "test";
    }

}
