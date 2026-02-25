package tn.esprit.paiement;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mic5/paiement")
public class PaiementRestAPI {
    @GetMapping("/hello")
    public String sayhello() {
        return "Hello I'm microservice de Paiement";
    }
}

