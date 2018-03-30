package PointOfSale;

public class Printer {
    static public void printReceipt(ScanningMachine scanner){
        System.out.println("\nReceipt:");
        double TotalPrice = 0;
        for(Product product: scanner.scanned){
            System.out.println(product.name + " " + product.price);
            TotalPrice+=product.price;
        }
        System.out.println("Total price: " + TotalPrice + "$\n");
    }


}
