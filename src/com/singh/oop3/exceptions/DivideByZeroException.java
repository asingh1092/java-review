package com.singh.oop3.exceptions;

public class DivideByZeroException extends ArithmeticException {
    public DivideByZeroException() {
        super("Divided by zero!");
    }
}
