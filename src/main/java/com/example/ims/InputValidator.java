package com.example.ims;

public class InputValidator {
    public static boolean isValidQuantity(int quantity) {
        return quantity >= 0;
    }

    public static boolean isValidPrice(double price) {
        return price >= 0.0;
    }

    public static boolean isValidString(String str) {
        return str != null && !str.trim().isEmpty();
    }
}