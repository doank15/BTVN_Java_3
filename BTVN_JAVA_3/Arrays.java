package BTVN_JAVA_3;

import java.util.Scanner;

public class Arrays {
    private int[] arr;
    private int n;
    
    public static Scanner sc = new Scanner(System.in);
    public Arrays() {
        n = 0;
        arr = null;
    }
    public Arrays(int[] arr, int n) {
        this.n = n;
        this.arr = arr;
    }
    public void InputData() {
        System.out.println("Nhap n: ");
        n = sc.nextInt();
        arr = new int[n];
        System.out.println("Nhap mang: ");
        for(int i = 0 ;i < n ; i++) {
            System.out.print("\narr[" + i + "] = ");
            arr[i] = sc.nextInt();
        } 
    }
    public void Show() {
        for(int i = 0 ;i < n ;i++ ) {
            System.out.print("\narr[" + i +"] = " + arr[i]);
        }
    }
    public int Sum() {
        System.out.println("Tong cac phan tu: ");
        int sum = 0;
        for(int i = 0 ;i<n;i++) {
            sum += arr[i];
        }
        return sum;
    }
    public void Filter(boolean flag) {
        if(flag == true) {
            System.out.println("Cac phan tu chan cua mang: ");
            for(int i = 0; i<n ; i++ ) {
                if(arr[i] % 2 == 0) {
                    System.out.println(arr[i]);
                }
            }
        }
        else {
            System.out.println("Cac phan tu le cua mang: ");
            for(int i = 0; i<n ; i++ ) {
                if(arr[i] % 2 != 0) {
                    System.out.println(arr[i]);
                }
            }
        }
    }
    public void setNumber(int n) {
        this.n = n;
    }
    public int getNumber() {
        return n;
    }
    public void setArr(int[] arr) {
        this.arr = arr;
    }
    public int[] getArr() {
        return arr;
    }

}
