package Bai2;
import java.util.Scanner;

public class Date {
    Scanner sc = new Scanner(System.in);
    private int day;
    private int month;
    private int year;
    public void Nhap() {
        System.out.println("Day: ");
        day =sc.nextInt();
        System.out.println("Month: ");
        month =sc.nextInt();
        System.out.println("Year: ");
        year = sc.nextInt();
    }
    public void Xuat() {
        System.out.print(day + " - " + month + " - " + year);
    }
}
