package tn.esprit.forums;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ForumsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ForumsApplication.class, args);
	}

}
