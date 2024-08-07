package com.example.ims;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class ExceptionHandler {
    public static void handleException(Exception e) {
        System.out.println("Error: " + e.getMessage());
    }

    public static void handleInputMismatchException(InputMismatchException e) {
        System.out.println("Input mismatch error: " + e.getMessage());
    }

    public static void handleNoSuchElementException(NoSuchElementException e) {
        System.out.println("No such element error: " + e.getMessage());
    }

    public static void handleIllegalArgumentException(IllegalArgumentException e) {
        System.out.println("Illegal argument error: " + e.getMessage());
    }
}