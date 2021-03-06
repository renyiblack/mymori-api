package mymori.mymoriapi.exceptions;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND, reason="Card(s) not found!")  // 404
public class CardNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 1;
}
