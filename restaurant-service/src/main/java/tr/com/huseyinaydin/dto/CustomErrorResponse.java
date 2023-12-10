package tr.com.huseyinaydin.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

//بسم الله الرحمن الرحيم

/**
 *
 * @author Huseyin_Aydin
 * @since 1994
 * @category Java, Spring Boot Microservices Exception Handling.
 *
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CustomErrorResponse {

    private HttpStatus status;
    private String errorMessage;
    private String errorCode;
}