package Bai1;

import java.util.Scanner;

public class DieuHoa extends SanPham{
    private float congSuat;
    private float giaBan;
    Scanner sc = new Scanner(System.in);
    public void DH_Input() {
            System.out.println("Cong Suat: ");
            congSuat = sc.nextFloat();
            System.out.println("Gia Ban (Trieu Dong): ");
            giaBan = sc.nextFloat();
    }
    public void DH_Output() {
        System.out.println("Cong Suat: " + congSuat);
        System.out.println("Gia Ban: " + giaBan);
    }
}
