package tr.com.huseyinaydin.exception;

//بسم الله الرحمن الرحيم

/**
 *
 * @author Huseyin_Aydin
 * @since 1994
 * @category Java, Spring Boot Microservices Exception Handling.
 *
 */

public class SpeedyServiceException extends RuntimeException{

    public SpeedyServiceException(String message) {
        super(message);
    }
}