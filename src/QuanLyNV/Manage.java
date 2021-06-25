package QuanLyNV;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Manage {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<NhanVien> list = new ArrayList<>();
    static ArrayList<NVPart> listPart = new ArrayList<>();
    static ArrayList<NVFull> listFull = new ArrayList<>();


    public static void themNV() {
        while (true) {
            System.out.println("1 . Nhân viên FullTime");
            System.out.println("2 . Nhân viên PartTime");
            System.out.println("0 . Exit");
            int choice = Integer.parseInt(sc.nextLine());
            if (choice == 0)
                return;
            switch (choice) {
                case 1:
                    nhanVienFull();
                    break;
                case 2:
                    nhanVienPart();
                    break;
            }
        }
    }

    public static void tinhLuong() {
        while (true) {
            System.out.println("1 .  Tính lương nhân viên FullTime");
            System.out.println("2 .  Tính lương nhân viên PartTime");
            System.out.println("0 .  Exit");
            int choice = Integer.parseInt(sc.nextLine());
            if (choice == 0) {
                return;
            }
            switch (choice) {
                case 1:
                    luongNVFUll();
                    break;
                case 2:
                    luongNVPart();
                    break;
            }
        }
    }

    public static void luongNVFUll() {
        System.out.println("Nhập tên nhân viên cần tính lương");
        String hoTen = sc.nextLine();
        int Luong = 0;
        for (NVFull nhanVien : listFull) {
            if (hoTen.equals(nhanVien.getHoTen())) {

                Luong = (int) (nhanVien.getLuong() * 10);

            }
        }
        System.out.println("Lương của " + hoTen + " là : " + Luong);
    }

    public static void luongNVPart() {
        System.out.println("Nhập tên nhân viên cần tính lương");
        String hoTen = sc.nextLine();
        int Luong = 0;
        for (NVPart nhanVien : listPart) {
            if (hoTen.equals(nhanVien.getHoTen())) {
                Luong = (int) (nhanVien.getSoGio() * nhanVien.getLuong());
            }
        }
        System.out.println("Lương của " + hoTen + " là : " + Luong);
    }

    public static void nhanVienFull() {
        System.out.println("Nhập tên nhân viên");
        String hoTen = sc.nextLine();
        System.out.println("Nhập tuổi");
        int doTuoi = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập giới tính");
        String goiTinh = sc.nextLine();
        System.out.println("Nhập số điện thoại");
        int soDT = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập số lương ");
        int Luong = Integer.parseInt(sc.nextLine());
        list.add(new NVFull(hoTen, doTuoi, goiTinh, soDT, Luong));
    }

    public static void nhanVienPart() {
        System.out.println("Nhập tên nhân viên");
        String hoTen = sc.nextLine();
        System.out.println("Nhập tuổi");
        int doTuoi = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập giới tính");
        String goiTinh = sc.nextLine();
        System.out.println("Nhập số điện thoại");
        int soDT = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập số lương ");
        int Luong = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập số giờ làm được");
        int soGio = Integer.parseInt(sc.nextLine());
        list.add(new NVPart(hoTen, doTuoi, goiTinh, soDT, Luong, soGio));
    }

    public static void xoaNV() {
        System.out.println("Nhập tên nhân viên");
        String hoTen = sc.nextLine();
        for (NhanVien nhanVien : list) {
            if (nhanVien instanceof NhanVien && nhanVien.getHoTen().equals(hoTen)) {
                list.remove(nhanVien);
            }
        }
    }

    public static void hienThiNV() {
        for (NhanVien quanLyNv : list) {
            quanLyNv.hienThi();
        }
    }

    public static void sapXepNV() {
        list.sort(new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                return o1.getDoTuoi() - o2.getDoTuoi();
            }
        });
    }
}
