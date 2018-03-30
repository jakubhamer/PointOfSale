package PointOfSale;

public class Product {
    public String name;
    public double price;
    public String barcode;

    public Product(String name, double price, String barcode) {
        this.name = name;
        if (price < 0)
            throw new IllegalArgumentException("Price cannot be smaller than one cent.");
        else
            this.price = price;
        this.barcode = barcode;
    }
}
