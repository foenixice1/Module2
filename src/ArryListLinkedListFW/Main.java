package ArryListLinkedListFW;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Menu");
            System.out.println("1 . Thêm sản phẩm");
            System.out.println("2 . Sửa thông tin sản phẩm");
            System.out.println("3 . Xóa sản phẩm");
            System.out.println("4 . Hiển thị danh sách sản phẩm");
            System.out.println("5 . Tìm kiếm sản phẩm");
            System.out.println("6 . Sắp xếp sản phẩm tăng");
            System.out.println("7 . Sắp xếp sản phẩm giảm");
            System.out.println("0 . Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1 :
                    ProductManager.themSanPham();
                    break;
                case 2:
                    ProductManager.suaSanPham();
                    break;
                case 3:
                    ProductManager.xoaSanPham();
                    break;
                case 4 :
                    ProductManager.hienThi();
                    break;
                case 5:
                    ProductManager.timKiemSp();
                    break;
                case 6:
                    ProductManager.sapXepTang();
                    break;
                case 7:
                    ProductManager.sapXepGiam();
                    break;
                case 0:
                System.exit(0);
            }
        }
    }
}
