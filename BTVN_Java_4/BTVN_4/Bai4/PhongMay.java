package Bai4;

import java.util.Scanner;

public class PhongMay {
    private String maPhong;
    private String tenPhong;
    private float dienTich;
    private QuanLy x;
    private May[] y;
    private int n;

    Scanner sc = new Scanner(System.in);

    public void Nhap() {
        System.out.println("Nhap ma phong: ");
        maPhong = sc.nextLine();
        System.out.println("Nhap ten phong: ");
        tenPhong = sc.nextLine();
        System.out.println("Nhap dien tich: ");
        dienTich = sc.nextFloat();
        x = new QuanLy();
        x.Nhap();
        System.out.println("Nhap n: ");
        n = sc.nextInt();
        y = new May[n];
        for (int i = 0; i < n; i++) {
            y[i] = new May();
            y[i].Nhap();
        }
    }

    public void Xuat() {
        System.out.println("Ma Phong: " + maPhong);
        System.out.println("Ten Phong: " + tenPhong);
        System.out.println("Dien Tich: " + dienTich);
        System.out.println("Kieu May " + " " + " Ma May" + " " + " Tinh Trang");
        for (int i = 0; i < n; i++) {
            y[i].Xuat();
        }
    }
}
