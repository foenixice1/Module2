package BTVN_QlyNvienCG;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Quản lý nhân viên Codegym");
            System.out.println("1. Thêm nhân viên");
            System.out.println("2. Đuổi nhân viên");
            System.out.println("3. Hiển thị daonh thu theo tên");
            System.out.println("4. Tìm nhân viên theo tên");
            System.out.println("5. Sắp xếp nhân viên theo tên");
            System.out.println("6. Sắp xếp nhân viên theo doanh thu");
            System.out.println("7. Hiển thị nhân viên");
            System.out.println("0. Exit");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("1. Nhân viên đào tạo");
                    System.out.println("2. Nhân viên tuyển sinh");
                    int choiceThem = Integer.parseInt(scanner.nextLine());
                    if (choiceThem == 1) {
                        System.out.println("1. Nhân viên PartTime");
                        System.out.println("2. Nhân viên FullTime");
                        int choiceThem2 = Integer.parseInt(scanner.nextLine());
                        if (choiceThem2 == 1)
                            ManageNV.themNhanVien(1);
                        else ManageNV.themNhanVien(2);
                    } else ManageNV.themNhanVien(3);
                    break;
                case 2:
                    System.out.println("1. Nhân viên đào tạo");
                    System.out.println("2. Nhân viên tuyển sinh");
                    int choiceDuoi = Integer.parseInt(scanner.nextLine());
                    if (choiceDuoi == 1)
                        ManageNV.xoaNhanVien(1);
                    else ManageNV.xoaNhanVien(2);
                    break;
                case 3:
                    ManageNV.hienThiLuongTheoTen();
                    break;
                case 4:
                    ManageNV.hienThiTheoTen();
                    break;
                case 5:
                    ManageNV.sortTheoDoanhThu();
                    break;
                case 6:
                    ManageNV.sortTheoTen();
                    break;
                case 0:
                    System.exit(0);
            }

        }
    }


}
