package DaLuong;

public class DemSo implements Runnable{
    @Override
    public void run() {
        for ( int i = 0 ; i <= 10 ; i++) {
            System.out.println("Số :" + i);
        }
    }

    public static void main(String[] args) {
        DemSo demSo = new DemSo();
        Thread thread = new Thread(demSo);

        thread.start();
    }
}
