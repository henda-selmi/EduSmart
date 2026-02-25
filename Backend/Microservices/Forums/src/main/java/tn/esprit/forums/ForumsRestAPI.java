package tn.esprit.forums;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mic3/forums")
public class ForumsRestAPI {
    @GetMapping("/hello")
    public String sayhello() {
        return "Hello I'm microservice de Forums";
    }
}


