package HomeWork2;

public class KySu extends CanBo{
    private String Nganh;

    public KySu(String hoTen, String namSinh, String gioiTinh, String diaChi, String bac, String nganh) {
        Nganh = nganh;
    }

    public KySu(String hoTen, String namSinh, String gioTinh, String diaChi, String nganh) {
        super(hoTen, namSinh, gioTinh, diaChi);
        Nganh = nganh;
    }

    public String getNganh() {
        return Nganh;
    }

    public void setNganh(String nganh) {
        Nganh = nganh;
    }

    @Override
    public void hienthi() {
        System.out.println("KySu{" +
                "Nganh='" + Nganh + '\'' +
                '}');;
    }
}
