package BTVN_JAVA_3;

public class Guns {
    private String weaponName;
    private int ammoNumber;
    public Guns(String weapoString, int ammoNumber) {
        this.weaponName = weapoString;
        this.ammoNumber = ammoNumber;
    }
    public void Load(int x) {
        this.ammoNumber+=x;
    }     
    public String Shoot(int x) {
        if(ammoNumber - x < 0) {
            return "Het Dan";
            
        }
        else {
            this.ammoNumber-=x;
            return Integer.toString(this.ammoNumber);
        }
    }
    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }
    public String getWeaponName() {
        return weaponName;
    }
    public void setAmmonNumber(int ammoNumber) {
        this.ammoNumber = ammoNumber;
    }
    public int getAmmonNumber() {
        return ammoNumber;
    }
}
