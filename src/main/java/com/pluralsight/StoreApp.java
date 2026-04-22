package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;
public class StoreApp {
    public static void main(String[] args) {
        ArrayList<Product> inventory = getInventory();
        System.out.println("We carry the following inventory: ");
        for (int i = 0; i < inventory.size(); i++) {
            Product p = inventory.get(i);
            System.out.printf("id: %d %s - Price: $%.2f%n",
                    p.getId(), p.getName(), p.getPrice());
        }
    }
    public static ArrayList<Product> getInventory() {
        ArrayList<Product> inventory = new ArrayList<Product>();
// this method loads product objects into inventory
// and its details are not shown
        inventory.add(new Product(1234, "Hammer",19.49));
        inventory.add(new Product(2345, "Box of Nails",9.29));
        inventory.add(new Product(9154, "9-in-1 Ratcheting Screwdriver",24.97));
        inventory.add(new Product(1648, "10 Crescent Wrench",15.95));
        inventory.add(new Product(9876, "Mechanics Tool Set",119.00));
        inventory.add(new Product(1212, "Spring Clamp",.99));
        inventory.add(new Product(3434, "Large Trigger Clamps",36.97));
        return inventory;
    }
}
