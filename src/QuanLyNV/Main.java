package QuanLyNV;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        while (true) {
            System.out.println("Menu");
            System.out.println("1 . Thêm nhân viên");
            System.out.println("2 . Tính lương nhân viên");
            System.out.println("3 . Sắp xếp nhân viên");
            System.out.println("4 . Hiển thị nhân viên");
            System.out.println("5 . Xóa nhân viên");
            System.out.println("0 . Exit");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1 :
                    Manage.themNV();
                    break;
                case 2 :
                    Manage.tinhLuong();
                    break;
                case 3:
                    Manage.sapXepNV();
                    break;
                case 4:
                    Manage.hienThiNV();
                    break;
                case 5:
                    Manage.xoaNV();
                    break;
                case 0:
                    System.exit(0);
            }
        }
    }
}
