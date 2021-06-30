package DaLuong;

import java.time.LocalDateTime;

public class Phut implements Runnable {
    @Override
    public void run() {
        while (true) {
            LocalDateTime now = LocalDateTime.now();
            int phut = now.getMinute();
            System.out.println("Phút hiện tại là : " + phut + "p");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
