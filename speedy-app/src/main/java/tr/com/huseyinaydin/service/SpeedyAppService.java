package tr.com.huseyinaydin.service;

import tr.com.huseyinaydin.client.RestaurantServiceClient;
import tr.com.huseyinaydin.dto.OrderResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//بسم الله الرحمن الرحيم

/**
 *
 * @author Huseyin_Aydin
 * @since 1994
 * @category Java, Spring Boot Microservices Exception Handling.
 *
 */

@Service
public class SpeedyAppService {

    @Autowired
    private RestaurantServiceClient restaurantServiceClient;

    public String greeting() {
        return "Zibidy Gonzales uygulamasına hoş geldiniz bacı gardaş.";
    }

    public OrderResponseDTO checkOrderStatus(String orderId) {
        return restaurantServiceClient.fetchOrderStatus(orderId);
    }
}