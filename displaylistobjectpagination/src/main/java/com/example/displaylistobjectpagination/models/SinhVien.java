package com.example.displaylistobjectpagination.models;

public class SinhVien {
    private String tenSV;
    private String maSV;

    public String getMaSV() {
        return maSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public SinhVien(String maSV, String tenSV) {
        this.tenSV = tenSV;
        this.maSV = maSV;
    }
}
