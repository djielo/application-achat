package com.jerome.applicationachat.exceptions;

public class CommandeNotFoundException extends RuntimeException {
    public CommandeNotFoundException (String message){
        super(message);
    }
}
