package tn.esprit.cours;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mic2/cours")
public class CoursRestAPI {
    @GetMapping("/hello")
    public String sayhello() {
        return "Hello I'm microservice de cours";
    }
}



