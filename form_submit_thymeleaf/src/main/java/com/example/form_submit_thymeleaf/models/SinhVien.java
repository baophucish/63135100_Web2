package com.example.form_submit_thymeleaf.models;

public class SinhVien {
    private String tenSV;
    private String maSV;

    public SinhVien() {
        super();
    }

    public SinhVien(String tenSV, String maSV) {
        this.tenSV = tenSV;
        this.maSV = maSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

}
