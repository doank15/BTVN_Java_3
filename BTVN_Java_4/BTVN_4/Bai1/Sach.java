package Bai1;

import java.util.Scanner;

public class Sach {
    Scanner sc = new Scanner(System.in);
    private String maSach;
    private String tenSach;
    private String nhaXuatBan;
    private int soTrang;
    private float giaTien;

    public void Nhap() {
        System.out.println("Enter code of book : ");
        maSach = sc.nextLine();
        System.out.println("Enter name of book : ");
        tenSach = sc.nextLine();
        System.out.println("Enter name of writer : ");
        nhaXuatBan = sc.nextLine();
        System.out.println("Enter Pages Number : ");
        soTrang = sc.nextInt();
        System.out.println("Enter price of book : ");
        giaTien = sc.nextFloat();
    }
    public void Xuat() {
         System.out.println(maSach +  "\t"  + tenSach +  "\t" + nhaXuatBan + "\t " +  soTrang + " \t "  + giaTien); 
    }
   
}
