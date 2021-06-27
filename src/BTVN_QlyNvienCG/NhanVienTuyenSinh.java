package BTVN_QlyNvienCG;

public class NhanVienTuyenSinh extends NhanVien{
    private int soTuyenSinh;

    public NhanVienTuyenSinh(int soTuyenSinh) {
        this.soTuyenSinh = soTuyenSinh;
    }

    public NhanVienTuyenSinh(String ten, int tuoi, String gioiTinh, String soDT, String gmail, double tienLuong, int soTuyenSinh) {
        super(ten, tuoi, gioiTinh, soDT, gmail, tienLuong);
        this.soTuyenSinh = soTuyenSinh;
    }

    public int getSoTuyenSinh() {
        return soTuyenSinh;
    }

    public void setSoTuyenSinh(int soTuyenSinh) {
        this.soTuyenSinh = soTuyenSinh;
    }

    @Override
    public double getLuongNhan() {
        return this.getTienLuong() * 8 + (this.getSoTuyenSinh()*10);
    }

    @Override
    public String toString() {
        return "NhanVienTuyenSinh{" +
                "soTuyenSinh=" + soTuyenSinh + " doanh thu = " + getLuongNhan() +
                '}' + super.toString();
    }
}
