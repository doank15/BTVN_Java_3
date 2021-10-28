package BTVN_JAVA_3;

import java.util.Random;

public class RunMainBai3 {
    public static void main(String[] args) {
        Random rd = new Random();

        Guns DiepBeDe = new Guns("AK", 50);
        Guns DoanXinhGai = new Guns("AK47",100);
        while(true) {
            String res1 = DiepBeDe.Shoot(rd.nextInt(10)+1);
            String res2 = DoanXinhGai.Shoot(rd.nextInt(10)+1);
            if(res1.equals("Het Dan") && res2.equals("Het Dan")) {
                System.out.println("Ca Hai Het Dan");
                System.exit(0);
            }    
            else if(res1.equals("Het Dan")) {
                System.out.println("DoanXinhGai Win");
                System.exit(0);
            }
            else if(res2.equals("Het Dan")) {
                System.out.println("DiepBeDe Win");
                System.exit(0);
            }
        }

    }
}
