package tn.esprit.evaluation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mic4/evaluation")
public class EvaluationRestAPI {
    @GetMapping("/hello")
    public String sayhello() {
        return "Hello I'm microservice d'Evaluation";
    }
}

