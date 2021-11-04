package Bai4;

import java.util.Scanner;

public class May {
    private String KMay;
    private String maMay;
    private String tinhTrang;
    Scanner sc = new Scanner(System.in); 
    public void Nhap() {
        System.out.println("Nhap kieu may: ");
        KMay = sc.nextLine();
        System.out.println("Nhap ma may: ");
        maMay = sc.nextLine();
        System.out.println("Nhap tinh trang: ");
        tinhTrang = sc.nextLine();
    }
    public void Xuat() {
        System.out.println("\t"+KMay+ "\t" + maMay + "\t" + tinhTrang);
    }
}
