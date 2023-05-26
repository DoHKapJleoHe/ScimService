package ru.nsu.fit.g20202.scimservice.exceptions;

public class UniqueAttributeException extends RuntimeException{
    private String message;

    public UniqueAttributeException(String attribute)
    {
        message = "Attribute " + attribute + " is uniqueness";
    }

    public String getMessage()
    {
        return message;
    }
}
