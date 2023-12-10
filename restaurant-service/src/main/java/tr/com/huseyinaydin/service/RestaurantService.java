package tr.com.huseyinaydin.service;

import tr.com.huseyinaydin.dao.RestaurantOrderDAO;
import tr.com.huseyinaydin.dto.OrderResponseDTO;
import tr.com.huseyinaydin.exception.OrderNotFoundException;
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
public class RestaurantService {

    @Autowired
    private RestaurantOrderDAO orderDAO;

    public String greeting() {
        return "Zibidy Gonzales Restoranına hoş geldiniz millet. Sefalar getirdiniz. Tebrikler...";
    }

    public OrderResponseDTO getOrder(String orderId) {
        OrderResponseDTO orderResponseDTO = orderDAO.getOrders(orderId);
        if (orderResponseDTO != null) {
            return orderResponseDTO;
        } else {
            throw new OrderNotFoundException("Böyle bir sipariş yok. Bulunamadı. Bulunamayan sipariş :" + orderId);
        }
    }
}