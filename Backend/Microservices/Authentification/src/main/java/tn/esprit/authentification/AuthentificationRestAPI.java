package tn.esprit.authentification;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mic1/autho")
public class AuthentificationRestAPI {
    @GetMapping("/hello")
    public String sayhello() {
        return "Hello I'm microservice d'authentification";
    }
}

