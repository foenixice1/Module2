package HomeWork2;

public class CanBo {
    private String hoTen;
    private String namSinh;
    private String gioTinh;
    private String diaChi;

    public CanBo() {
    }

    public CanBo(String hoTen, String namSinh, String gioTinh, String diaChi) {
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.gioTinh = gioTinh;
        this.diaChi = diaChi;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(String namSinh) {
        this.namSinh = namSinh;
    }

    public String getGioTinh() {
        return gioTinh;
    }

    public void setGioTinh(String gioTinh) {
        this.gioTinh = gioTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }


    public void hienthi() {
        System.out.println("CanBo{" +
                "hoTen='" + hoTen + '\'' +
                ", namSinh='" + namSinh + '\'' +
                ", gioTinh='" + gioTinh + '\'' +
                ", diaChi='" + diaChi + '\'' +
                '}'); ;
    }
}
