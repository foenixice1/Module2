package ArryListLinkedListFW;

public class Product {
    private int id;
    private String name;
    private String gia;

    public Product() {

    }

    public Product(String name, String gia) {
    }

    public Product(int id, String name, String gia) {
        this.id = id;
        this.name = name;
        this.gia = gia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }


    public void hienThi() {
        System.out.println("Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gia='" + gia + '\'' +
                '}');
    }
}
