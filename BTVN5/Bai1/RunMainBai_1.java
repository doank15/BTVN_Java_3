package Bai1;
import java.util.Scanner;

// class SanPham {
//     private String id;
//     private String name;
//     private String date;
//     Scanner sc = new Scanner(System.in);
//     public void SP_Input() {
//         System.out.println("ID: ");
//         id = sc.nextLine();
//         System.out.println("Name: ");
//         name = sc.nextLine();
//         System.out.println("Date (Day - Month - Year): ");
//         date = sc.nextLine();
//     }
//     public void SP_Output() {
//         System.out.println("ID: " + id);
//         System.out.println("Name: " + name);
//         System.out.println("Date: " + date);
//     }
// }

// class DieuHoa extends SanPham{
//     private float congSuat;
//     private float giaBan;
//     Scanner sc = new Scanner(System.in);
//     public void DH_Input() {
//             System.out.println("Cong Suat: ");
//             congSuat = sc.nextFloat();
//             System.out.println("Gia Ban (Trieu Dong): ");
//             giaBan = sc.nextFloat();
//     }
//     public void DH_Output() {
//         System.out.println("Cong Suat: " + congSuat);
//         System.out.println("Gia Ban: " + giaBan);
//     }
// }

public class RunMainBai_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhap n: ");
        n = sc.nextInt();
        DieuHoa[] x = new DieuHoa[n];
        for(int i = 0 ; i< n ; i++) {
            x[i] = new DieuHoa();
            x[i].SP_Input();
            x[i].DH_Input();
        }
        for(int i = 0 ; i < n ; i++) {
            System.out.print("San Pham Thu: " + i + "\n");
            x[i].SP_Output();
            x[i].DH_Output();
            System.out.println("");
        }
        sc.close();
    }
}
