import java.util.Scanner;

public class Cau_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s_input;
        int count = 0, sum = 0, s = 1;

        System.out.println("Nhap Chuoi: ");
        s_input = sc.nextLine();
        
        for(char c : s_input.toCharArray()) {
            if(Character.isDigit(c)) {
                count++;
                sum += (int)c-48;
            }
        }
        
        for(char c : s_input.toCharArray()) {
            if(Character.isDigit(c)) {
                int x = (int) c - 48;
                if(sum % x ==0) {
                    s*=x;
                }
            }
        }
        System.out.println("Chuoi co: " + count + " chu so!!!");
        System.out.println("Tich: " + s);
        sc.close();
    }
}
