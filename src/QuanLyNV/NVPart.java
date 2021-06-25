package QuanLyNV;

public class NVPart extends NhanVien {
    private int soGio;

    public NVPart(int soGio) {
        this.soGio = soGio;
    }

    public NVPart(String hoTen, int doTuoi, String gioiTinh, int soDT, double luong, int soGio) {
        super(hoTen, doTuoi, gioiTinh, soDT, luong);
        this.soGio = soGio;
    }

    public int getSoGio() {
        return soGio;
    }

    public void setSoGio(int soGio) {
        this.soGio = soGio;
    }
}
