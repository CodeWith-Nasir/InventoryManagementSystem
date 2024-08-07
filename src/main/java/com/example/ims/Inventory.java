package com.example.ims;

import java.util.ArrayList;

public class Inventory {
    private ArrayList<Item> items;

    public Inventory() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        if (!InputValidator.isValidString(item.getName())) {
            System.out.println("Item name cannot be empty.");
            return;
        }
        if (!InputValidator.isValidQuantity(item.getQuantity())) {
            System.out.println("Quantity cannot be negative.");
            return;
        }
        if (!InputValidator.isValidPrice(item.getPrice())) {
            System.out.println("Price cannot be negative.");
            return;
        }
        items.add(item);
        System.out.println("Item added successfully.");
    }

    public void updateItem(String itemName, int quantity, double price) {
        if (!InputValidator.isValidString(itemName)) {
            System.out.println("Item name cannot be empty.");
            return;
        }
        if (!InputValidator.isValidQuantity(quantity)) {
            System.out.println("Quantity cannot be negative.");
            return;
        }
        if (!InputValidator.isValidPrice(price)) {
            System.out.println("Price cannot be negative.");
            return;
        }
        for (Item item : items) {
            if (item.getName().equalsIgnoreCase(itemName)) {
                item.setQuantity(quantity);
                item.setPrice(price);
                System.out.println("Item updated successfully.");
                return;
            }
        }
        System.out.println("Item not found!");
    }

    public void displayInventory() {
        if (items.isEmpty()) {
            System.out.println("Inventory is empty.");
        } else {
            for (Item item : items) {
                System.out.println("Item Name: " + item.getName());
                System.out.println("Quantity: " + Formatter.formatQuantity(item.getQuantity()));
                System.out.println("Price: " + Formatter.formatPrice(item.getPrice()));
                System.out.println("-----------");
            }
        }
    }
}