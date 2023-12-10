package tr.com.huseyinaydin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

//بسم الله الرحمن الرحيم

/**
 *
 * @author Huseyin_Aydin
 * @since 1994
 * @category Java, Spring Boot Microservices Exception Handling.
 *
 */

@SpringBootApplication
@EnableEurekaServer
public class SpeedyServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpeedyServiceRegistryApplication.class, args);
	}
}