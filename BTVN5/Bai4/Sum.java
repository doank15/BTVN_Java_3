package Bai4;

public class Sum<A> {
    private A soA;
    private A soB;
    public Sum(A soA, A soB) {
        this.soA = soA;
        this.soB = soB;
    }
    public A getSoA() {
        return soA;
    }
    public void setSoA(A soA) {
        this.soA = soA;
    }
    public A getSoB() {
        return soB;
    }
    public void setSoB(A soB) {
        this.soB = soB;
    }    
}

