package BTVN_QlyNvienCG;

public class NhanVienPartTime extends NhanVien {
    private int gioLam;

    public NhanVienPartTime(int gioLam) {
        this.gioLam = gioLam;
    }

    public NhanVienPartTime(String ten, int tuoi, String gioiTinh, String soDT, String gmail, double tienLuong, int gioLam) {
        super(ten, tuoi, gioiTinh, soDT, gmail, tienLuong);
        this.gioLam = gioLam;
    }

    public int getGioLam() {
        return gioLam;
    }

    public void setGioLam(int gioLam) {
        this.gioLam = gioLam;
    }

    @Override
    public double getLuongNhan() {
        return this.getTienLuong() * this.getGioLam();
    }

    @Override
    public String toString() {
        return "NhanVienPartTime{" +
                "gioLam=" + gioLam + " doanh thu = " + getLuongNhan() +
                '}' + super.toString();
    }
}
