package Bai2;

import java.util.Scanner;

public class Date {
    private int day;
    private int month;
    private int year;
    Scanner sc = new Scanner(System.in);
    public void D_Input() {
        System.out.println("Day: ");
        day = sc.nextInt();
        System.out.println("Month: ");
        month = sc.nextInt();
        System.out.println("Year: ");
        year = sc.nextInt();
    }
    public void D_Output() {
        System.out.printf(day+"/"+month+"/"+year);
    }
}
