package Bai1;
import java.util.Scanner;

public class SanPham {
    private String id;
    private String name;
    private String date;
    Scanner sc = new Scanner(System.in);
    public void SP_Input() {
        System.out.println("ID: ");
        id = sc.nextLine();
        System.out.println("Name: ");
        name = sc.nextLine();
        System.out.println("Date (Day - Month - Year): ");
        date = sc.nextLine();
    }
    public void SP_Output() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Date: " + date);
    }
}
