package Java_IO.DocGhi;

import java.io.*;
import java.util.ArrayList;

public class Main {
    static ArrayList<Nguoi> list = new ArrayList<>();
    static File Ktra = new File("Java_IO/DocGhi/Ktra.txt");

    public static void writeFile() throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(Ktra));
        for (Nguoi nguoi : list) {
            bw.write(nguoi.writeFile());
            bw.newLine();
        }
        bw.close();
    }

    private static void readarFile() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(Ktra));
        String line = "";
        while ((line = br.readLine()) != null) {
            String[] arr = line.split(",");
            list.add(new Nguoi(arr[0], Integer.parseInt(arr[1]), arr[2], Integer.parseInt(arr[3])));

        }
        br.close();
    }


    public static void main(String[] args) throws IOException {
        for (Nguoi nguoi : list) {
            System.out.println(nguoi.writeFile());
        }
        list.add(new Nguoi("Nam", 22, "nam", 0345634336));
        list.add(new Nguoi("Nam1", 23, "nam", 0345634337));
        list.add(new Nguoi("Nam2", 24, "nam", 0345634330));
        writeFile();
        readarFile();
    }

}
