package esprit.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class GatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
    }
    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder){
           //Load balancer
        return builder.routes() .route("authentification",r->r.path("/mic1/**")
                        .uri("lb://AUTHENTIFICATION") )

                .route("cours",r->r.path("/mic2/**")
                        .uri("lb://COURS") )
                .route("forums",r->r.path("/mic3/**")
                        .uri("lb://FORUMS") )
                .route("evaluation",r->r.path("/mic4/" +
                                "**")
                        .uri("lb://EVALUATION") )
                .route("paiement",r->r.path("/mic5/**")
                        .uri("lb://PAIEMENT") )
                .build();
    }
}
