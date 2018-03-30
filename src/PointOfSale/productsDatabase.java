package PointOfSale;

import java.util.Vector;

public class productsDatabase {
    public static Vector<Product> productsDatabase = new Vector<Product>();
    public static void fillDatabase(){
        productsDatabase.addElement(new Product("Cottage Cheese", 2, "001"));
        productsDatabase.addElement(new Product("Water", 4.5, "002"));
        productsDatabase.addElement(new Product("Milk", 3, "003"));
    }

}
