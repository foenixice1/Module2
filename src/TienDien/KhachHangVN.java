package TienDien;

public class KhachHangVN extends ThongTinKH {
    private int donGia;
    private int dinhMuc;
    private int soLuongKW;

    public KhachHangVN() {
    }

    public KhachHangVN(int donGia, int dinhMuc, int soLuongKW) {
        this.donGia = donGia;
        this.dinhMuc = dinhMuc;
        this.soLuongKW = soLuongKW;
    }

    public KhachHangVN(String maKhachHang, String hoTen, String ngayHoaDon, String doiTuongKH, int soLuongKW, int donGia, int dinhMuc, int soLuongKW1) {
        super(maKhachHang, hoTen, ngayHoaDon, doiTuongKH, soLuongKW);
        this.donGia = donGia;
        this.dinhMuc = dinhMuc;
        this.soLuongKW = soLuongKW1;
    }

    public KhachHangVN(String maKH, String ten, String ngayHD, int soLuongKW) {


    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public int getDinhMuc() {
        return dinhMuc;
    }

    public void setDinhMuc(int dinhMuc) {
        this.dinhMuc = dinhMuc;
    }


    public int getSoLuongKW() {
        return soLuongKW;
    }

    public void setSoLuongKW(int soLuongKW) {
        this.soLuongKW = soLuongKW;
    }


    public void hienThi() {
        System.out.println("KhachHangVN{" +
                "donGia=" + donGia +
                ", dinhMuc=" + dinhMuc +
                ", soLuongKW=" + soLuongKW +
                '}');
    }
}
