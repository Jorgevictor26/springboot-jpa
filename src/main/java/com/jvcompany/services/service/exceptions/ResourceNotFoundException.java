package com.jvcompany.services.service.exceptions;

public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException(Long id)
    {
        super("Resource Not found. Id " + id);
    }
}
