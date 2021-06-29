import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

//Muốn lưu nhị phân bắt buộc các class phải implements Serializable

public class DemoDocGhiFileNhiPhan {


    public void ghiFile(ArrayList<Product> products) throws Exception {
        FileOutputStream fileOutputStream = new FileOutputStream("nguoiNhiPhan.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fileOutputStream);
        oos.writeObject(products);
        oos.close();

    }

    public ArrayList<Product> docFile() throws Exception {
        FileInputStream fileInputStream = new FileInputStream("nguoiNhiPhan.txt");
        ObjectInputStream ops = new ObjectInputStream(fileInputStream);
        ArrayList<Product> products = (ArrayList<Product>) ops.readObject();
        ops.close();
        return products;
    }
}
