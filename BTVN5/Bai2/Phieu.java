package Bai2;

import java.util.Scanner;

public class Phieu {
    private String maPhieu;
    private String tenPhieu;
    private Date a;
    private Product[] x;
    int n;
    Scanner sc = new Scanner(System.in);
    public void C_Input() {
        System.out.println("Nhap ma phieu: ");
        maPhieu = sc.nextLine();
        System.out.println("Nhap ten phieu: ");
        tenPhieu = sc.nextLine();
        a = new Date();
        a.D_Input();
        System.out.println("Nhap n: ");
        n = sc.nextInt();
        x = new Product[n];
        for(int i = 0; i< n; i++) {
            x[i] = new Product();
            x[i].P_Input();
        }
    }

    public void C_Output() {
        System.out.println("Ma Phieu: " + maPhieu);
        System.out.println("Ten Phieu: " + tenPhieu);
        System.out.println("Date: ");
        a.D_Output();
        System.out.println("");
        System.out.printf("%10s %10s %10s %10s %10s", "ID", "Name","Quantity", "Price", "Sum");   
        System.out.println("");
        for(int i = 0 ; i<n;i++) {
            x[i].P_Output();
            System.out.println("");
        }
    }
}
