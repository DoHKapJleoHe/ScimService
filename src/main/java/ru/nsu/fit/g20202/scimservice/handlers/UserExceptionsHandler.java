package ru.nsu.fit.g20202.scimservice.handlers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import ru.nsu.fit.g20202.scimservice.exceptions.ImmutableAttributeException;
import ru.nsu.fit.g20202.scimservice.exceptions.UniqueAttributeException;
import ru.nsu.fit.g20202.scimservice.exceptions.UserNotFoundException;

@RestControllerAdvice
public class UserExceptionsHandler
{

    @ExceptionHandler(value = {UserNotFoundException.class})
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String UserNotFoundExceptionHandler(UserNotFoundException exception)
    {
        return exception.getMessage();
    }

    @ExceptionHandler(value = {ImmutableAttributeException.class})
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public String ImmutableAttributeExceptionHandler(ImmutableAttributeException exception)
    {
        return exception.getMessage();
    }

    @ExceptionHandler(value = {UniqueAttributeException.class})
    @ResponseStatus(HttpStatus.CONFLICT)
    public String UniqueAttributeExceptionHandler(UniqueAttributeException exception)
    {
        return exception.getMessage();
    }

}
