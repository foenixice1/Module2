package TienDien;

public class KhachHangNN extends ThongTinKH {
    private String quocTich;
    private int donGia;
    private int soLuongKW;

    KhachHangNN() {

    }

    public KhachHangNN(String quocTich, int donGia, int soLuongKW) {
        this.quocTich = quocTich;
        this.donGia = donGia;
        this.soLuongKW = soLuongKW;
    }

    public KhachHangNN(String maKhachHang, String hoTen, String ngayHoaDon, String doiTuongKH, int soLuongKW, String quocTich, int donGia, int soLuongKW1) {
        super(maKhachHang, hoTen, ngayHoaDon, doiTuongKH, soLuongKW);
        this.quocTich = quocTich;
        this.donGia = donGia;
        this.soLuongKW = soLuongKW1;
    }

    public KhachHangNN(String maKH, String quocTich, String ten, String ngayHD, int soLuongKW) {

    }

    public String getQuocTich() {
        return quocTich;
    }

    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }


    public int getSoLuongKW() {
        return soLuongKW;
    }


    public void setSoLuongKW(int soLuongKW) {
        this.soLuongKW = soLuongKW;
    }


    public void hienThi() {
        System.out.println("KhachHangNN{" +
                "quocTich='" + quocTich + '\'' +
                ", donGia=" + donGia +
                ", soLuongKW=" + soLuongKW +
                '}');
    }
}
