package com.jvcompany.services.service.exceptions;

public class ResourceNotFoundException extends RuntimeException{
    private static final long serialVersionUID = 1L;
    public ResourceNotFoundException(Long id)
    {
        super("Resource Not found. Id " + id);
    }
}
