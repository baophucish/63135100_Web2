package com.example.display_list_object.models;

public class SinhVien {
    private String tenSV;
    private String maSV;

    public SinhVien() {
        super();
    }

    public SinhVien(String maSV, String tenSV) {
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
