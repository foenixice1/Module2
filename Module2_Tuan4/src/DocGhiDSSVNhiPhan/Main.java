package DocGhiDSSVNhiPhan;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void ghiFile(String path, List<Student> students){
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(students);
            oos.close();
            fos.close();
        }catch (IOException e ) {
            e.printStackTrace();
        }
    }
    public static List<Student> docFile(String path) {
        List<Student> students = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            students = (List<Student>) ois.readObject();
            fis.close();
            ois.close();
        }catch (Exception e) {
            e.printStackTrace();
        }
        return students;
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Nguye Hoai Nam","Thai Nguyen"));
        students.add(new Student(2, "Nguye Hoai Nam1","Thai Nguyen"));
        students.add(new Student(3, "Nguye Hoai Nam2","Thai Nguyen"));
        students.add(new Student(4, "Nguye Hoai Nam3","Thai Nguyen"));
        students.add(new Student(5, "Nguye Hoai Nam4","Thai Nguyen"));
        ghiFile("student.txt",students);
        List<Student> st = docFile("student.txt");
        for (Student student : st) {
            System.out.println(student);
        }
    }
}
