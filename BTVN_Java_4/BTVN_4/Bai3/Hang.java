package Bai3;
import java.util.Scanner;

public class Hang {
    private String id_Hang;
    private String name_Hang;
    private float price_Hang;
    Scanner sc = new Scanner(System.in);
    public void Input() {
        System.out.println("Enter Id: ");
        id_Hang = sc.nextLine();
        System.out.println("Enter Name: ");
        name_Hang = sc.nextLine();
        System.out.println("Enter Name: ");
        price_Hang = sc.nextFloat();
    }
    public void Output() {
        System.out.println(id_Hang + " " + name_Hang + " " + price_Hang);
    }
    public float getPrice() {
        return price_Hang;
    }
}
