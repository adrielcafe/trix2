package trix2.web.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import trix2.services.UtilService;

/**
 * Created by misael on 07/12/2015.
 */
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UtilService utilService;

//    @RequestMapping("/current")
//    public User currentUser(){
//        User user = utilService.getUser();
//       return user;
//    }
}
