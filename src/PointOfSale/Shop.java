package PointOfSale;

import java.util.Scanner;

public class Shop {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        ScanningMachine scanner = new ScanningMachine();
        String code = "";
        while (!code.equals("exit")) {
            code = sc.nextLine();
            scanner.scanProduct(code);
        }
    }
}
