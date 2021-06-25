package QuanLyNV;

public class NhanVien {
    private String hoTen ;
    private int doTuoi;
    private String gioiTinh;
    private int soDT;
    private double Luong ;

    public NhanVien() {
    }

    public NhanVien(String hoTen, int doTuoi, String gioiTinh, int soDT, double luong) {
        this.hoTen = hoTen;
        this.doTuoi = doTuoi;
        this.gioiTinh = gioiTinh;
        this.soDT = soDT;
        Luong = luong;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getDoTuoi() {
        return doTuoi;
    }

    public void setDoTuoi(int doTuoi) {
        this.doTuoi = doTuoi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public int getSoDT() {
        return soDT;
    }

    public void setSoDT(int soDT) {
        this.soDT = soDT;
    }

    public double getLuong() {
        return Luong;
    }

    public void setLuong(double luong) {
        Luong = luong;
    }


    public void hienThi() {
        System.out.println("NhanVien{" +
                "hoTen='" + hoTen + '\'' +
                ", doTuoi=" + doTuoi +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", soDT=" + soDT +
                ", Luong=" + Luong +
                '}');
    }
}
