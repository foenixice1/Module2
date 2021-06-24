package TienDien;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Thông tin khách hàng");
            System.out.println("1 . Thêm khách hàng");
            System.out.println("2 . Sửa khách hàng");
            System.out.println("3 . Xóa khách hàng");
            System.out.println("4 . Tìm khách hàng theo tên");
            System.out.println("5 . Sắp xếp khách hàng");
            System.out.println("6 . Tính tiền điện khách hàng");
            System.out.println("0 . Exit");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1 :
                    QuanLyKH.themKhachHang();
                    break;
                case 2 :
                    QuanLyKH.suaKhachHang();
                    break;
                case 3:
                    QuanLyKH.xoaKhachHang();
                    break;
                case 4:
                    QuanLyKH.timTen();
                    break;
                case 5:
                    QuanLyKH.sapXepTheoMa();
                    break;
                case 6:
                    QuanLyKH.thanhToan();
                    break;
                case 0:
                    System.exit(0);
            }
        }
    }
}
