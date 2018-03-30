package PointOfSale;

import java.util.Vector;

public class ScanningMachine {

    public Vector<Product> scanned;

    public ScanningMachine() {
        productsDatabase.fillDatabase();
        scanned = new Vector<Product>();


    }

    public Product getProduct(String scannedBarCode){
        for (Product product : productsDatabase.productsDatabase)
            if (product.barcode.equals(scannedBarCode))
                return product;
        return new Product("",0,scannedBarCode);
    }

    public int isBarcodeValid(String scannedBarCode) {
        if (scannedBarCode.equals("")) return 2;
        for (Product product : productsDatabase.productsDatabase)
            if (product.barcode.equals(scannedBarCode))
                return 0;
        return 1;
    }

    public void scanProduct(String scannedBarCode) {
        int barCodeScanningResult = isBarcodeValid(scannedBarCode);
        if (barCodeScanningResult == 0)
            scanned.addElement(getProduct(scannedBarCode));
        else if (scannedBarCode.equals("exit")){
            Printer.printReceipt(this);
            scanned.clear();
            return;
        }
        LcdDisplay.updateLCD(barCodeScanningResult, getProduct(scannedBarCode));
    }


}
