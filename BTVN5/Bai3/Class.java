package Bai3;

import java.util.ArrayList;

public class Class {
    private String maLopHoc;
    private String tenLopHoc;
    private String ngayMo;
    private ArrayList<Students> x = new ArrayList<>();
    private int n;
    private String giaoVien;

    public Class() {}
    public String getMaLopHoc() {
        return maLopHoc;
    }
    public void setMaLopHoc(String maLopHoc) {
        this.maLopHoc = maLopHoc;
    }
    public String getTenLopHoc() {
        return tenLopHoc;
    }
    public void setTenLopHoc(String tenLopHoc) {
        this.tenLopHoc = tenLopHoc;
    }
    public String getNgayMo() {
        return ngayMo;
    }
    public void setNgayMo(String ngayMo) {
        this.ngayMo = ngayMo;
    }
    public Integer getNumber() {
        return n;
    }
    public ArrayList<Students> getX() {
        return x;
    }
    public void setX(ArrayList<Students> x) {
        this.x = x;
    }
    public void setNumber(int n) {
        this.n = n;
    }
    public String getGiaoVien() {
        return giaoVien;
    }

    public void setGiaoVien(String giaoVien) {
        this.giaoVien = giaoVien;
    }
}
