package com.example.ims;

public class Formatter {
    public static String formatPrice(double price) {
        return String.format("%.2f", price);
    }

    public static String formatQuantity(int quantity) {
        return String.format("%d", quantity);
    }
}