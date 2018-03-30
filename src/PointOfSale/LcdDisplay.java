package PointOfSale;

import java.util.Vector;

public class LcdDisplay {
    static public Vector<String> Lcd = new Vector<String>(0);
    static public void showLcd() {
        System.out.println("Scanned products:");
        for( String product: Lcd) System.out.println(product);

    }

    static public void updateLCD(int informationID, Product product) {
        switch (informationID){
            case 0:
                Lcd.addElement(product.name + ": " + product.price+"$");
                break;
            case 1:
                Lcd.addElement("Product not found -> " + product.barcode);
                break;
            case 2:
                Lcd.addElement("Invalid bar-code!");
                break;
        }
        showLcd();
        System.out.print("\n");
    }


}
