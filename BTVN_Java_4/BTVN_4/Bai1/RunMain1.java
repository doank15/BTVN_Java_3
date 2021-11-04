package Bai1;
import java.util.Scanner;

public class RunMain1 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n;
       System.out.println("Enter Number of books: ");
       n = sc.nextInt();
       Sach[] sach = new Sach[n];
       for(int i = 0 ; i < n ;i++) {
            sach[i] = new Sach();
            sach[i].Nhap();
       }
        System.out.println("Information of Books which You was entered");    
        System.out.println("Id\t " + " Name\t " + " Writer\t" + "Page Number\t" + " Price");   
        for(int i = 0 ; i < n ;i++) {
           sach[i].Xuat();
           System.out.println();
       }
       
       sc.close();
    }
}
