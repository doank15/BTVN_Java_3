package Bai5;
public class RunMainBai5 {
    public static boolean isPrime(int n)  {
        if(n < 2 ) return false;
        for(int i =2 ;i*i<=n ; i++) {
            if(n % i ==0) {
                return false;
            }
        }
        return true;
    }
    public static boolean isPrime(long n)  {
        if(n < 2 ) return false;
        for(int i =2 ;i*i<=n ; i++) {
            if(n % i ==0) {
                return false;
            }
        }
        return true;
    }
    public static boolean isPrime(float n)  {
       if((n - Math.ceil(n)) > 0) {
           return false;
       }
       else {
            if(n < 2 ) return false;
            for(int i =2 ;i*i<=n ; i++) {
            if(n % i ==0) {
                return false;
            }
            }
        }
        return true; 
    }
    public static boolean isPrime(double n) {
        if((n - Math.ceil(n)) > 0) {
            return false;
        }
        else {
            if(n < 2 ) return false;
            for(int i =2 ;i*i<=n ; i++) {
            if(n % i ==0) {
                return false;
            }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        boolean res = isPrime(4);
        if(res == true) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }

    }
}
