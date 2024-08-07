package com.example.ims;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Item");
            System.out.println("2. Update Item");
            System.out.println("3. Display Inventory");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            try {
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        System.out.print("Enter item name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter item quantity: ");
                        int quantity = scanner.nextInt();
                        System.out.print("Enter item price: ");
                        double price = scanner.nextDouble();
                        Item item = new Item(name, quantity, price);
                        inventory.addItem(item);
                        break;
                    case 2:
                        System.out.print("Enter item name to update: ");
                        String itemName = scanner.nextLine();
                        System.out.print("Enter new quantity: ");
                        int newQuantity = scanner.nextInt();
                        System.out.print("Enter new price: ");
                        double newPrice = scanner.nextDouble();
                        inventory.updateItem(itemName, newQuantity, newPrice);
                        break;
                    case 3:
                        inventory.displayInventory();
                        break;
                    case 4:
                        System.out.println("Exiting...");
                        scanner.close();
                        System.exit(0);
                    default:
                        System.out.println("Invalid option! Try again.");
                }
            } catch (InputMismatchException e) {
                scanner.nextLine();
                ExceptionHandler.handleInputMismatchException(e);
            } catch (Exception e) {
                ExceptionHandler.handleException(e);
            }
        }
    }
}