package Bai3;

public class Students extends Person {
    private String S_code;
    private String major;
    private int lock;
    Students() {
        S_code = " ";
        major = " ";
        lock = 0;
    }
    public String getScode() {
        return S_code;
    }
    public void setScode(String S_code){
        this.S_code = S_code;
    }
    public String getMajor() {
        return major;
    }
    public void setMajor(String major){
        this.major = major;
    }
    public Integer getLock() {
        return lock;
    }
    public void setLock(int lock) {
        this.lock = lock;
    }
    public void s_Input() {
        P_Input();
        System.out.println("Enter Student's code:");
        setScode(sc.nextLine());
        System.out.println("Enter major: ");
        setMajor(sc.nextLine());
        System.out.println("Enter lock: ");
        setLock(sc.nextInt());
    }
    public void s_Output() {
        P_Output();
        System.out.printf("%10s %10s %10s" , getScode(),getMajor(),getLock());
    }
}
