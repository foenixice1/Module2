package QLSanPham;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ManageSP manageSP = new ManageSP();
        while (true) {
            System.out.println("Menu");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Hiển thị sản phẩm");
            System.out.println("3. Tìm sản phẩm");
            System.out.println("0. Exit");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1 :
                    manageSP.add();
                    break;
                case 2:
                    manageSP.hienThi();
                    break;
                case 3:
                    manageSP.timSP();
                    break;
                case 0:
                System.exit(0);
            }
        }
    }
}
