package Bai2;
import java.util.Scanner;

public class Employee {
    private Date NS = new Date();
    private String id;
    private String name;
    Scanner sc = new Scanner(System.in);
    public void Nhap() {
        System.out.println("Enter Id: ");
        id = sc.nextLine();
        System.out.println("Enter Name: ");
        name = sc.nextLine();
        NS.Nhap();
    }
    public void Xuat() {
        System.out.print(id + "\t" + name + "\t");
        NS.Xuat();
    }
}
