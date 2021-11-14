package Bai4;

public class RunMainBai_4 {
    public static void main(String[] args) {
        Sum<Integer> sumInteger = new Sum<Integer>(1,2);
        Sum<Float> sumFloat = new Sum<Float>(3.4f, 5.2f);
        Sum<Long> sumLong = new Sum<Long>(11L, 12L);
        Sum<Double> sumDouble = new Sum<Double>(7.8, 12.2);
        System.out.println("Sum Integer: "+ (sumInteger.getSoA()+sumInteger.getSoB()));
        System.out.println("Sum Float: " + (sumFloat.getSoA()+sumFloat.getSoB()));
        System.out.println("Sum Float: " + (sumLong.getSoA()+sumLong.getSoB()));
        System.out.println("Sum Float: " + (sumDouble.getSoA()+sumDouble.getSoB()));
        
    }
}
