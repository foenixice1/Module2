package TienDien;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class QuanLyKH {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<ThongTinKH> list = new ArrayList<>();


    public static void themKhachHang() {
        while (true) {
            System.out.println("Thêm khách hàng");
            System.out.println("1 . Khách hàng Việt Nam");
            System.out.println("2 . Khách hàng nước ngoài");
            System.out.println("3 . Exit");
            int choice = Integer.parseInt(sc.nextLine());
            if (choice == 3) {
                return;
            }
            switch (choice) {
                case 1:
                    khachHangVN();
                    break;
                case 2:
                    khachHangNN();
                    break;
            }
        }
    }

    public static void thanhToan() {
        while (true) {
            System.out.println("Tính tiền khách hàng");
            System.out.println("1 . Khách hàng Việt Nam");
            System.out.println("2 .Khách hàng nước ngoài");
            System.out.println("3 . Exit");
            int choice = Integer.parseInt(sc.nextLine());
            if (choice == 3) {
                return;
            }
            switch (choice) {
                case 1:
                    tinhTienVN();
                    break;
                case 2:
                    tinhTienNN();
                    break;
            }
        }
    }

    public static void khachHangVN() {
        System.out.println("Mã khách hàng");
        String maKH = sc.nextLine();
        System.out.println("Tên khách hàng");
        String ten = sc.nextLine();
        System.out.println("Ngày tháng năm của hóa đơn");
        String ngayHD = sc.nextLine();
        System.out.println("Số lượng điện thiêu thu");
        int soLuongKW = sc.nextInt();
        list.add(new KhachHangVN(maKH, ten, ngayHD, soLuongKW));
    }

    public static void khachHangNN() {
        System.out.println("Mã khách hàng");
        String maKH = sc.nextLine();
        System.out.println("Quốc tịch");
        String quocTich = sc.nextLine();
        System.out.println("Tên khách hàng");
        String ten = sc.nextLine();
        System.out.println("Ngày tháng năm của hóa đơn");
        String ngayHD = sc.nextLine();
        System.out.println("Số lượng điện thiêu thu");
        int soLuongKW = sc.nextInt();
        list.add(new KhachHangNN(maKH, quocTich, ten, ngayHD, soLuongKW));
    }

    public static void tinhTienVN() {
        KhachHangVN vn = new KhachHangVN();
        int num = sc.nextInt();
        double thanhTien;
        if (vn.getDinhMuc() <= num) {
            thanhTien = vn.getSoLuongKW() * vn.getDonGia();
        } else {
            thanhTien = (vn.getSoLuongKW() * vn.getDonGia() * vn.getDinhMuc()) + ((vn.getSoLuongKW() - vn.getDinhMuc()) * vn.getDonGia() * 2.5);
        }
        System.out.println("Số tiền phải trả là : " + thanhTien);
    }

    public static void tinhTienNN() {
        KhachHangNN nn = new KhachHangNN();
        double thanhTien = nn.getSoLuongKW() * nn.getDonGia();
        System.out.println("Số tiền phải trả là : " + thanhTien);
    }

    public static void suaKhachHang() {
        System.out.println("Nhập tên khách hàng cần sửa");
        String hoTenCu = sc.nextLine();
        System.out.println("Nhập thông tin mới");
        System.out.println("Mã khách hàng");
        String maKH = sc.nextLine();
        System.out.println("Nhập quốc tịch");
        String quocTich = sc.nextLine();
        System.out.println("Tên khách hàng");
        String ten = sc.nextLine();
        System.out.println("Ngày tháng năm của hóa đơn");
        String ngayHD = sc.nextLine();
        System.out.println("Số lượng điện thiêu thu");
        int soLuongKW = sc.nextInt();
        ThongTinKH thongTinKH = new ThongTinKH(maKH, quocTich, ten, ngayHD, soLuongKW);
        int index = list.indexOf(hoTenCu);
        list.set(index, thongTinKH);
    }

    public static void xoaKhachHang() {
        System.out.println("Nhập tên khách hàng cần xóa");
        String hoTen = sc.nextLine();
        for (ThongTinKH khachHang : list) {
            if (khachHang instanceof ThongTinKH && khachHang.getHoTen().equals(hoTen)) ;
            list.remove(khachHang);
        }
    }

    public static void timTen() {
        System.out.println("Nhập tên khách hàng cần tìm");
        String hoTen = sc.nextLine();
        int index = list.indexOf(hoTen);
        if (index < 0)
            System.out.println("Không có kết quả");
        else System.out.println(list.get(index));
    }

    public static void sapXepTheoMa() {
        list.sort(new Comparator<ThongTinKH>() {
            @Override
            public int compare(ThongTinKH o1, ThongTinKH o2) {
                return o1.getMaKhachHang().compareTo(o2.getMaKhachHang());
            }
        });
    }


}
