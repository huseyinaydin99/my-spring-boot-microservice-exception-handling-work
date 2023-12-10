package tr.com.huseyinaydin.advice;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import tr.com.huseyinaydin.dto.CustomErrorResponse;
import tr.com.huseyinaydin.exception.SpeedyServiceException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

//بسم الله الرحمن الرحيم

/**
 *
 * @author Huseyin_Aydin
 * @since 1994
 * @category Java, Spring Boot Microservices Exception Handling.
 *
 */

@RestControllerAdvice
@Slf4j
public class SpeedyServiceGlobalExceptionHandler {

    @ExceptionHandler(SpeedyServiceException.class)
    public ResponseEntity<?> handleSpeedyServiceException(SpeedyServiceException ex) throws JsonProcessingException {
        log.error("SpeedyServiceGlobalExceptionHandler::handleSpeedyServiceException metodu ile istisna işlendi. {}",ex.getMessage());
        CustomErrorResponse errorResponse = new ObjectMapper().readValue(ex.getMessage(), CustomErrorResponse.class);
        return ResponseEntity.internalServerError().body(errorResponse);
    }

//    @ExceptionHandler(Exception.class)
//    public ResponseEntity<?> handleGenericException(Exception ex){
//        CustomErrorResponse errorResponse= CustomErrorResponse.builder()
//                .status(HttpStatus.INTERNAL_SERVER_ERROR)
//                .errorCode(GlobalErrorCode.GENERIC_ERROR)
//                .errorMessage(ex.getMessage())
//                .build()  ;
//        log.error("RestaurantServiceGlobalExceptionHandler::handleGenericException metodu ile istisna işlendi. {}",ex.getMessage());
//        return ResponseEntity.internalServerError().body(errorResponse);
//    }
}