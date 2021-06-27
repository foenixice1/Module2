package BTVN_QlyNvienCG;

public class NhanVienFullTime extends NhanVien {
    public NhanVienFullTime() {
    }

    public NhanVienFullTime(String ten, int tuoi, String gioiTinh, String soDT, String gmail, double tienLuong) {
        super(ten, tuoi, gioiTinh, soDT, gmail, tienLuong);
    }

    @Override
    public double getLuongNhan() {
        return this.getTienLuong() * 8;
    }

    @Override
    public String toString() {
        return "NhanVienFullTime {" + "doanhThu=" + getLuongNhan() + '}' +
                super.toString();
    }
}
