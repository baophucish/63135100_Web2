package thigk_ntu63135100.nguyenhoangbaophuc_qlbanhang.models;

public class MatHang {
    private String tenMH;
    private String maMH;
    private int giaMH;
    private String moTa;

    public MatHang(String maMH, String tenMH, int giaMH, String moTa) {
        this.maMH = maMH;
        this.tenMH = tenMH;
        this.giaMH = giaMH;
        this.moTa = moTa;
    }

    public String getTenMH() {
        return tenMH;
    }

    public void setTenMH(String tenMH) {
        this.tenMH = tenMH;
    }

    public String getMaMH() {
        return maMH;
    }

    public void setMaMH(String maMH) {
        this.maMH = maMH;
    }

    public int getGiaMH() {
        return giaMH;
    }

    public void setGiaMH(int giaMH) {
        this.giaMH = giaMH;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

}
