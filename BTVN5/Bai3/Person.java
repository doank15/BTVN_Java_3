package Bai3;

import java.util.Scanner;

public class Person {
    private String fullName;
    private String date;
    private String address;
    Scanner sc = new Scanner(System.in);
    public void P_Input() {
        System.out.println("Enter FullName: ");
        fullName = sc.nextLine();
        System.out.println("Enter Date: ");
        date =sc.nextLine();
        System.out.println("Enter Address");
        address = sc.nextLine();
    }
    public void P_Output() {
      System.out.printf("%10s %10s %10s", fullName,date,address);
    }
}
