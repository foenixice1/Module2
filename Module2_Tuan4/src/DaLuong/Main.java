package DaLuong;

public class Main {
    public static void main(String[] args) {
        Phut gio = new Phut();
        Thread g = new Thread(gio);
        Giay giay = new Giay();

        g.start();
        giay.start();
    }

}
