import java.io.Serializable;

public class Product implements Serializable {


    private int id;
    private String name;
    private String price;
    private String description;


    public Product(int id, String name, String price, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;

    }

    public String ghi() {
        return id + "," + name + "," + price + "," + description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}
