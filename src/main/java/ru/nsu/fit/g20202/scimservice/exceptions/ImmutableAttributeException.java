package ru.nsu.fit.g20202.scimservice.exceptions;

public class ImmutableAttributeException extends RuntimeException
{
    private String message;

    public ImmutableAttributeException(String attribute)
    {
        message = "Attribute " + attribute + "is readOnly";
    }

    public String getMessage()
    {
        return message;
    }
}
