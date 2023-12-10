package tr.com.huseyinaydin.dao;

import tr.com.huseyinaydin.dto.OrderResponseDTO;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

//بسم الله الرحمن الرحيم

/**
 *
 * @author Huseyin_Aydin
 * @since 1994
 * @category Java, Spring Boot Microservices Exception Handling.
 *
 */

@Component
public class RestaurantOrderDAO {
    public OrderResponseDTO getOrders(String orderId) {
        return generateRandomOrders().get(orderId);
    }

    private Map<String, OrderResponseDTO> generateRandomOrders() {
        Map<String, OrderResponseDTO> orderMap = new HashMap<>();
        orderMap.put("41fBr63", new OrderResponseDTO("41fBr63", "Adana Kebabı", 1, 199, new Date(), "Hazır!", 15));
        orderMap.put("1u77245x", new OrderResponseDTO("1u77245x", "Çağ Kebabı", 2, 641, new Date(), "Hazırlanıyor!", 59));
        orderMap.put("97plM802", new OrderResponseDTO("97plM802", "Şiş Kebabı", 1, 325, new Date(), "Teslim edildi!", 0));
        return orderMap;
    }

    public static void main(String[] args) {
        System.out.println("Hüseyin AYDIN ".toUpperCase());
    }
}