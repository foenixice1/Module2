package QLSanPham;

import java.io.Serializable;

public class SanPham implements Serializable {
    private int maSP ;
    private String tenSP;
    private String hangSX;
    private int gia;
    private String moTaKhac;

    public SanPham() {
    }

    public SanPham(int maSP, String tenSP, String hangSX, int gia, String moTaKhac) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.hangSX = hangSX;
        this.gia = gia;
        this.moTaKhac = moTaKhac;
    }

    public int getMaSP() {
        return maSP;
    }

    public void setMaSP(int maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getHangSX() {
        return hangSX;
    }

    public void setHangSX(String hangSX) {
        this.hangSX = hangSX;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public String getMoTaKhac() {
        return moTaKhac;
    }

    public void setMoTaKhac(String moTaKhac) {
        this.moTaKhac = moTaKhac;
    }


    public void hienThi() {
        System.out.println("SanPham{" +
                "maSP=" + maSP +
                ", tenSP='" + tenSP + '\'' +
                ", hangSX='" + hangSX + '\'' +
                ", gia=" + gia +
                ", moTaKhac='" + moTaKhac + '\'' +
                '}');
    }
}
