package org.example;

public class IncorrectDataException extends Exception {

    public static final String INCORRECT_VALUE = "Couldn't calculate the amount";

    public IncorrectDataException(String message) {
        super(message);
    }
}
