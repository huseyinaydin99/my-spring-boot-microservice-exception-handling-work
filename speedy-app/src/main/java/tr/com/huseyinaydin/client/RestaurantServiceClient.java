package tr.com.huseyinaydin.client;

import tr.com.huseyinaydin.dto.OrderResponseDTO;
import tr.com.huseyinaydin.exception.SpeedyServiceException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;

//بسم الله الرحمن الرحيم

/**
 *
 * @author Huseyin_Aydin
 * @since 1994
 * @category Java, Spring Boot Microservices Exception Handling.
 *
 */

@Component
@Slf4j
public class RestaurantServiceClient {

    @Autowired
    private RestTemplate template;

    public OrderResponseDTO fetchOrderStatus(String orderId) {
        OrderResponseDTO orderResponseDTO=null;
        try {
            orderResponseDTO= template.getForObject("http://RESTAURANT-SERVICE/restaurant/orders/status/" + orderId, OrderResponseDTO.class);
        } catch (HttpServerErrorException errorException) {
            log.error("RestaurantServiceClient::fetchOrderStatus sunucu hatası gardaş. {}", errorException.getResponseBodyAsString());
            throw new SpeedyServiceException(errorException.getResponseBodyAsString());
        } catch (Exception ex) {
            log.error("RestaurantServiceClient::fetchOrderStatus normal bir istisna gardaş. {}", ex.getMessage());
        }
        return orderResponseDTO;
    }
}