package sample;

import sample.model.Item;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        getItemsFromKeyboard();
    }

    private static void getItemsFromKeyboard(){
        System.out.println("Enter Item Name");
        Scanner nameScanner = new Scanner(System.in);
        String itemName = nameScanner.nextLine();

        System.out.println("Enter Item Price");
        Scanner priceScanner = new Scanner(System.in);
        Double price = priceScanner.nextDouble();

        System.out.println("Enter Item Quantity");
        Scanner quantityScanner = new Scanner(System.in);
        Integer quantity = quantityScanner.nextInt();

        createItem(itemName, price, quantity);
    }

    private static void createItem(String name, Double price, Integer quantity) {
        Item item = new Item(name, price, quantity);
        System.out.println("You bought:" + " " + item.getQuantity() + " x " + item.getName() + " for " + price+ "€");
    }
}
