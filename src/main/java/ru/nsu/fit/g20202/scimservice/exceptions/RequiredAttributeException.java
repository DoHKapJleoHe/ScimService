package ru.nsu.fit.g20202.scimservice.exceptions;

public class RequiredAttributeException extends RuntimeException
{
    private String message;

    public RequiredAttributeException(String attribute)
    {
        message = "Attribute " + attribute + " is required";
    }

    public String getMessage()
    {
        return message;
    }
}
