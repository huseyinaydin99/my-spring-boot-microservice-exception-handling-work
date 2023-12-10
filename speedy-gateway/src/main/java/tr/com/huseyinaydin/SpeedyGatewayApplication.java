package tr.com.huseyinaydin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

//بسم الله الرحمن الرحيم

/**
 *
 * @author Huseyin_Aydin
 * @since 1994
 * @category Java, Spring Boot Microservices Exception Handling.
 *
 */

@SpringBootApplication
@EnableDiscoveryClient
public class SpeedyGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpeedyGatewayApplication.class, args);
	}
}