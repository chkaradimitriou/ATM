package sample.logic;
import sample.model.Item;

import java.util.ArrayList;

public class ShoppingList {

    public void createList() {
        ArrayList<Item> item = new ArrayList<>();
        Item item1 = new Item("eggs",1.35, 6);
        Item item2 = new Item("potatoes",0.79, 2);
        Item item3 = new Item("CocaCola",1.20, 3);
        Item item4 = new Item("cake",3.56, 2);
        Item item5 = new Item("Milk",1.32, 4);

        item.add(item1);
        item.add(item2);
        item.add(item3);
        item.add(item4);
        item.add(item5);

        for (int i=0; i< item.size(); i++){
            Double price = item.get(i).getPrice();
            Integer quantity = item.get(i).getQuantity();
            System.out.println(price * quantity);
        }
    }
}
