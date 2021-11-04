package Bai3;
import java.util.Scanner;

public class Phieu {
    private String maPhieu;
    private Hang[] x;
    private int n; 
    Scanner sc = new Scanner(System.in);
    public void Nhap() {
        System.out.println("Nhap ma phieu: ");
        maPhieu = sc.nextLine();
        System.out.println("Nhap n: ");
        n = sc.nextInt();
        x = new Hang[n];
        for(int i = 0 ; i < n ;i++) {
            x[i] = new Hang();
            x[i].Input();
        }
    }
    public void Xuat() {
        System.out.println("Ma Phieu: " + maPhieu);
        System.out.println(" ID " + "  " + " Name " + " Price " );
        for(int i = 0; i < n ;i++) {
            x[i].Output();
        }
        float sumPrice = 0 ;
        for(int i = 0 ;i<n;i++) {
            sumPrice += x[i].getPrice();
        }
        System.out.println("Sum Price: " + sumPrice);
    }

}