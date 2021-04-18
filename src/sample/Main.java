package sample;

import sample.model.Item;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException{
        getItemsFromKeyboard();
    }

    private static void getItemsFromKeyboard()  {
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

        File file1 = new File("out.txt");
        FileWriter fw = null;
        try {
            fw = new FileWriter(file1);
        } catch (IOException e) {
            e.printStackTrace();
        }
        PrintWriter pw = new PrintWriter(fw);


        pw.println(name);
        pw.println(String.valueOf(price));
        pw.println(quantity);

        pw.close();


    }
}
