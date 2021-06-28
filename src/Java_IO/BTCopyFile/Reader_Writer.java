package Java_IO.BTCopyFile;

import java.io.*;

public class Reader_Writer {
    public static void FileWriterExample() {
        try {
            File f = new File("C:\\Users\\Admin\\Desktop\\hello.txt");
            FileWriter fw = new FileWriter(f);
            fw.write(" hello");
            fw.close();
        }catch (IOException ex) {
            System.out.println("Loi ghi file : " + ex);
        }
    }
    public static void FileReaderExample() {
        try {
            File f = new File("C:\\Users\\Admin\\Desktop\\hello.txt");
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            fr.close();
            br.close();
        }catch (Exception ex) {
            System.out.println("Loi doc file : " + ex);
        }
    }

    public static void main(String[] args) {
        FileReaderExample();
        FileWriterExample();
    }
}
