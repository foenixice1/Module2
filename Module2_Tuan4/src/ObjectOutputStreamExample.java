import java.io.*;

//Sử dụng ObjectOutputStream để ghi đối tượng vào file

public class ObjectOutputStreamExample {
    public static void main(String[] args) throws Exception {
        docFile();
        ghiFile();
    }

    public static void docFile() throws Exception {
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Admin\\Desktop\\hello.txt"));
            Product product = new Product(1, "Iphone 12 ProMax", "0345634336", "New");
            oos.writeObject(product);
            oos.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            oos.close();
        }
        System.out.println("Hoàn thành");
    }

    public static void ghiFile() throws Exception {
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("C:\\Users\\Admin\\Desktop\\hello.txt"));
            Product product = (Product) ois.readObject();
            System.out.println(product);
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            ois.close();
        }
    }
}
