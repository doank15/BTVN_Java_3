package Bai2;

import java.util.Scanner;

public class Product {
    private String id;
    private String name;
    private int quantity;
    private float price;
    Scanner sc = new Scanner(System.in);
    public void P_Input() {
        System.out.println("ID: ");
        id = sc.nextLine();
        System.out.println("Name: ");
        name = sc.nextLine();
        System.out.println("Quantity: ");
        quantity = sc.nextInt();
        System.out.println("Price: ");
        price = sc.nextFloat();
    }
    public void  P_Output() {
        System.out.printf("%10s %10s %10d %10f %10f", id, name,quantity, price, quantity*price);
    }
}
