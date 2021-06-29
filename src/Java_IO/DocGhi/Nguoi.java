package Java_IO.DocGhi;

public class Nguoi {
    private String name;
    private int age;
    private String gender;
    private int phoneNumber;


    public Nguoi(String name, int age, String gender, int phoneNumber) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Nguoi{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }

    public String writeFile() {
        return name + "," + age + "," + gender + "," + phoneNumber;
    }
}
