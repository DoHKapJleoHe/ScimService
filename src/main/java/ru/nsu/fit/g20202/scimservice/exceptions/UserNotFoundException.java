package ru.nsu.fit.g20202.scimservice.exceptions;

public class UserNotFoundException extends RuntimeException
{
        private String message;

        public UserNotFoundException(Integer id)
        {
            message = "Resource " + id + "not found";
        }

        public String getMessage()
        {
            return message;
        }

}
