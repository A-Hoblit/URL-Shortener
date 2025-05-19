package ahoblit.SpringBootURLShortener.web;

import ahoblit.SpringBootURLShortener.domain.exceptions.ShortUrlNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    private static final Logger log = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(ShortUrlNotFoundException.class)
    String handleShortUrlNotFound(ShortUrlNotFoundException ex) {
        log.error("Short URL Not Found: {}", ex.getMessage());
        return "error/404";
    }

    @ExceptionHandler(Exception.class)
    String handleException(Exception ex) {
        log.error("Exception: {}", ex.getMessage(), ex);
        return "error/500";
    }

}
