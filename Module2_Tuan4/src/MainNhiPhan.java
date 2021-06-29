import java.util.ArrayList;

public class MainNhiPhan {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        DemoDocGhiFileNhiPhan docGhiFile = new DemoDocGhiFileNhiPhan();

        products.add(new Product(1,"Nam","nam","hihi"));
        products.add(new Product(2,"Nam2","nam","hihi2"));

        try {
            docGhiFile.ghiFile(products);
            products = docGhiFile.docFile();
        }catch (Exception e) {
            e.printStackTrace();
        }

        for (Product p : products) {
            System.out.println(p.ghi());
        }

    }
}
