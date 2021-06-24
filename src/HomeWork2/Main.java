package HomeWork2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Quản lý Cán Bộ");
            System.out.println("1 : Thêm Cán Bộ");
            System.out.println("2 : Tìm Cán Bộ theo tên");
            System.out.println("3 : Tìm Cán Bộ theo ngành");
            System.out.println("4 : Xóa nhân viên");
            System.out.println("5 : Sửa thông tin Cán Bộ");
            System.out.println("6 : Hiển thị Cán Bộ");
            System.out.println("7 : Sắp xếp Cán Bộ");
            System.out.println("0 : Exit");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    QuanLyCanBo.themCanBo();
                    break;
                case 2:
                    QuanLyCanBo.timCanBo();
                    break;
                case 3:
                    QuanLyCanBo.timKiemNganh();
                    break;
                case 4:
                    QuanLyCanBo.xoaNhanVien();
                    break;
                case 5:
                    QuanLyCanBo.suaCanBo();
                    break;
                case 6:
                    QuanLyCanBo.hienThiCanBo();
                    break;
                case 7:
                    QuanLyCanBo.sapXepCanBo();
                    break;
                case 0:
                    System.exit(0);
            }
        }

    }
}
