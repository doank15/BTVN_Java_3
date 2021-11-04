package Bai4;

import java.util.Scanner;

public class QuanLy {
    private String maQl;
    private String HoTen;
    Scanner sc = new Scanner(System.in);
    public void Nhap() {
        System.out.println("Nhap ma Quan Ly: ");
        maQl = sc.nextLine();
        System.out.println("Nhap Ho va Ten: ");
        HoTen = sc.nextLine();
    }
    public void Xuat() {
        System.out.println(maQl+ " " + HoTen);
    }
}
