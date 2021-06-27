package BTVN_QlyNvienCG;

public class NhanVien {
    private String ten;
    private int tuoi;
    private String gioiTinh;
    private String soDT;
    private String gmail;
    private double tienLuong;
    private double luongNhan;

    public NhanVien() {
    }

    public NhanVien(String ten, int tuoi, String gioiTinh, String soDT, String gmail, double tienLuong) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.soDT = soDT;
        this.gmail = gmail;
        this.tienLuong = tienLuong;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public double getTienLuong() {
        return tienLuong;
    }

    public void setTienLuong(double tienLuong) {
        this.tienLuong = tienLuong;
    }

    public double getLuongNhan() {
        return luongNhan;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "ten='" + ten + '\'' +
                ", tuoi=" + tuoi +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", soDT='" + soDT + '\'' +
                ", gmail='" + gmail + '\'' +
                ", tienLuong=" + tienLuong +
                '}';
    }
}
