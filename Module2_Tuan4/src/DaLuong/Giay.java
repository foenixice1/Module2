package DaLuong;

import java.time.LocalDateTime;

public class Giay extends Thread {
    public void run() {
        while (true) {
            LocalDateTime now = LocalDateTime.now();
            int giay = now.getSecond();
            System.out.println("Giây hiện tại là : " + giay + "s");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
