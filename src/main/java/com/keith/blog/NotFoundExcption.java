package com.keith.blog;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class NotFoundExcption extends RuntimeException {

    public NotFoundExcption(String message) {
        super(message);
    }

    public NotFoundExcption(String message, Throwable cause) {
        super(message, cause);
    }

    public NotFoundExcption() {

    }
}
