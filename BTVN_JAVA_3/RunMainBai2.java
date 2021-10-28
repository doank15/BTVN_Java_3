package BTVN_JAVA_3;

public class RunMainBai2 {
    public static void main(String[] args) {
        Arrays arr1 = new Arrays();
        Arrays arr2 = new Arrays();
        arr1.InputData();
        arr2.InputData();
        System.out.println("Array 1: ");
        arr1.Show();
        System.out.println("Array 2: ");
        arr2.Show();
        float result = (float)arr1.Sum() / arr1.getNumber() - (float)arr2.Sum()/arr2.getNumber();
        if(result > 0) {
            System.out.println("\nArray 1!!!");
        }
        else if(result < 0 ){
            System.out.println("\nArray 2!!!");
        }
        else {
            System.out.println("\nBye!!!");
        }
    }
}
