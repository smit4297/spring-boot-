package com.npci.exception;

import java.text.MessageFormat;

public class UserNotFoundException extends RuntimeException{

    public UserNotFoundException(Long id){
        super(MessageFormat.format("user not found: {0}", id));
    }
}
