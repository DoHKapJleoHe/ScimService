package ru.nsu.fit.g20202.scimservice.exceptions;

public class ResourceNotFoundException extends RuntimeException
{
        private String message;

        public ResourceNotFoundException(Integer id)
        {
            message = "Resource " + id + " not found";
        }

        public String getMessage()
        {
            return message;
        }

}
