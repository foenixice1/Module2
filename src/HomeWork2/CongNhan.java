package HomeWork2;

public class CongNhan extends CanBo {
    private String Bac;
    private String Nganh;

    public CongNhan(String hoTen, String gioiTinh, String diaChi, String bac, String nganh) {
        Bac = bac;
        Nganh = nganh;
    }

    public CongNhan(String hoTen, String namSinh, String gioTinh, String diaChi, String bac, String nganh) {
        super(hoTen, namSinh, gioTinh, diaChi);
        Bac = bac;
        Nganh = nganh;
    }

    public String getBac() {
        return Bac;
    }

    public void setBac(String bac) {
        Bac = bac;
    }

    public String getNganh() {
        return Nganh;
    }

    public void setNganh(String nganh) {
        Nganh = nganh;
    }

    @Override
   public void hienthi(){
        System.out.println("CongNhan{" +
                "Bac='" + Bac + '\'' +
                ", Nganh='" + Nganh + '\'' +
                '}');
    }


}
