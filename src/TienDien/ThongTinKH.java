package TienDien;

public class ThongTinKH {
    private String maKhachHang;
    private String hoTen ;
    private String ngayHoaDon;
    private String doiTuongKH;
    private int soLuongKW;

    public ThongTinKH() {
    }

    public ThongTinKH(String maKhachHang, String hoTen, String ngayHoaDon, String doiTuongKH, int soLuongKW) {
        this.maKhachHang = maKhachHang;
        this.hoTen = hoTen;
        this.ngayHoaDon = ngayHoaDon;
        this.doiTuongKH = doiTuongKH;
        this.soLuongKW = soLuongKW;
    }


    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgayHoaDon() {
        return ngayHoaDon;
    }

    public void setNgayHoaDon(String ngayHoaDon) {
        this.ngayHoaDon = ngayHoaDon;
    }

    public String getDoiTuongKH() {
        return doiTuongKH;
    }

    public void setDoiTuongKH(String doiTuongKH) {
        this.doiTuongKH = doiTuongKH;
    }

    public int getSoLuongKW() {
        return soLuongKW;
    }

    public void setSoLuongKW(int soLuongKW) {
        this.soLuongKW = soLuongKW;
    }

    public void hienThi() {
        System.out.println("ThongTinKH{" +
                "maKhachHang='" + maKhachHang + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", ngayHoaDon='" + ngayHoaDon + '\'' +
                ", doiTuongKH='" + doiTuongKH + '\'' +
                ", soLuongKW='" + soLuongKW + '\'' +
                '}');
    }
}
