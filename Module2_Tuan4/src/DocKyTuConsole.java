import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class DocKyTuConsole {
    public static void main(String[] args) throws IOException {
        ReadByteConsole();
        InputStreamExample();

    }

//    Nhập từng ký tự từ bàn phím và hiên thị kết quả lên màn hình

    public static void ReadByteConsole() throws IOException {
        InputStream is = System.in;
        while (true) {
            System.out.println("Nhập 1 ký tự :");
            int ch = is.read();
            if (ch == 'q') {
                System.out.println("Đã nhập hết ký tự từ bàn phím");
                break;
            }
//   Loại bỏ 2 ký tự \r và \n
            is.skip(2);
            System.out.println("Ký tự nhận được là : " + (char) ch);
        }
    }

//    Đọc nội dung của file sử dụng FileInputStream

    public static void InputStreamExample() throws IOException {
// Tạo một đối tượng InputStream : Luồng đọc một file
        InputStream is = new FileInputStream("C:\\Users\\Admin\\Desktop\\hello.txt");
        int i = -1;
// Đọc lần lượt các byte (8bit) trong luồng và lưu vào biến i
// Khi đọc ra giá trị -1 nghĩa là kết thúc luồng.
        while ((i = is.read()) != -1) {
            System.out.println((char) i);
        }
        is.close();
    }

    //Đọc nhiều byte sử dụng FileInputStream
    public static void InputStreamExample2() throws IOException {
//Tạo một luồng đầu vào bằng cách đọc một file
        InputStream in = new FileInputStream("C:\\Users\\Admin\\Desktop\\hello.txt");
//Mảng để mỗi lần đọc các byte từ luồng thì tạm thời để lên đó
//Ta dùng mảng 10 byte
        byte[] bytes = new byte[10];
        int i = -1;
        // Đọc các byte trong luồng và gán lên các phần tử của mảng.
// Giá trị i là số đọc được của 1 lần. (i sẽ <= 10).
// Khi không còn phần tử trong luồng i sẽ = -1
        while ((i = in.read(bytes)) != -1) {
// Tạo String từ các byte đọc được
            String s = new String(bytes, 0, i);
            System.out.println(s);
        }
        in.close();

    }

}

