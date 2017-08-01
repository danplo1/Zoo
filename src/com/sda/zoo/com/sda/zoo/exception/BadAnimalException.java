package com.sda.zoo.com.sda.zoo.exception;

/**
 * Created by Daniel on 2017-06-09.
 */
public class BadAnimalException extends Exception {
    @Override
    public String getMessage() {
        return "This Animal has been initialized in a wrong way!";


    }
}
