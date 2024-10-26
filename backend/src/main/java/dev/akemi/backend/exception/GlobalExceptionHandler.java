package dev.akemi.backend.exception;

import dev.akemi.backend.model.RestBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {
    @ExceptionHandler(Exception.class)
    public RestBean<String> exception(Exception e) {
        log.error(e.getMessage());
        return RestBean.failure(500,"内部错误，请联系管理员");
    }
}
