package DaLuong.DuaXe;

import java.util.Random;

public class Car implements Runnable {
    private String nameCar;

    public Car(String nameCar) {
        this.nameCar = nameCar;
    }

    @Override
    public void run() {
        int khoangCach = 0;
        long batDau = System.currentTimeMillis();
        while (khoangCach <= Main.quangDuong) {
            try {
                int tocDo = (new Random().nextInt(50));
                String log = "|";
                khoangCach += tocDo;
                int phanTram = (khoangCach * 1000) / Main.quangDuong;
                for (int i = 0; i < Main.quangDuong; i += Main.step) {
                    if (phanTram >= i + Main.step) {
                        log += "=";
                    } else if (phanTram >= i && phanTram < i + Main.step) {
                        log += "o";
                    } else {
                        log += "-";
                    }

                }
                log += "|";
                System.out.println("Car" + this.nameCar + ":" + log + " " + Math.min(Main.quangDuong, khoangCach) + "KM");
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Car" + this.nameCar + " broken...");
                break;

            }

        }
        long ketThuc = System.currentTimeMillis();
        System.out.println("Car " + this.nameCar + " Finish in " + (ketThuc - batDau) / 1000 + "s");

    }
}
