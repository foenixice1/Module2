package BTVN_QlyNvienCG;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class ManageNV {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<NhanVien> list = new ArrayList<>();

    public static void themNhanVien(int kieuNhanVien) {
        NhanVien nhanVien = taoNhanVien(kieuNhanVien);
        list.add(nhanVien);
    }

    public static NhanVien taoNhanVien(int kieuNhanVien) {
        String ten = getTen();
        int tuoi = getTuoi();
        String gioiTinh = getGioiTinh();
        String soDT = getSoDT();
        String gmail = getGmail();
        double tienLuong = getTienLuong();

        if (kieuNhanVien == 1) {
            System.out.println("Nhập giờ :");
            int gio = Integer.parseInt(sc.nextLine());
            return new NhanVienPartTime(ten, tuoi, gioiTinh, soDT, gmail, tienLuong, gio);
        } else if (kieuNhanVien == 2) {
            return new NhanVienFullTime(ten, tuoi, gioiTinh, soDT, gmail, tienLuong);
        } else {
            System.out.println("Nhập số học sinh tuyển sinh được :");
            int soTuyenSinh = Integer.parseInt(sc.nextLine());
            return new NhanVienTuyenSinh(ten, tuoi, gioiTinh, soDT, gmail, tienLuong, soTuyenSinh);
        }
    }

    public static void xoaNhanVien(int kieuNhanVien) {
        System.out.println("Nhập tên :");
        String hoTen = sc.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if (kieuNhanVien == 1) {
                if (list.get(i).getTen().equals(hoTen)) {
                    if (list.get(i) instanceof NhanVienFullTime || list.get(i) instanceof NhanVienPartTime) {
                        list.remove(i);
                        i--;
                    }
                }
            } else if (kieuNhanVien == 2) {
                if (list.get(i).getTen().equals(hoTen)) {
                    if (list.get(i) instanceof NhanVienTuyenSinh) {
                        list.remove(i);
                        i--;
                    }
                }
            }
        }
    }

    public static void hienThiLuongTheoTen() {
        System.out.println("Nhập tên :");
        String hoTen = sc.nextLine();
        for (NhanVien nv : list) {
            if (nv.getTen().equals(hoTen)) {
                System.out.println(hoTen + ":" + nv.getTienLuong());
            }
        }
    }

    public static void hienThiTheoTen() {
        System.out.println("Nhập tên :");
        String ten = sc.nextLine();
        for (NhanVien nv : list) {
            System.out.println(nv);
        }
    }

    public static void sortTheoTen() {
        list.sort(new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                return o1.getTen().compareTo(o2.getTen());
            }
        });
    }

    public static void sortTheoDoanhThu() {
        list.sort(new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                if (o1.getTienLuong() > o2.getTienLuong()) return 1;
                else return -1;
            }
        });
    }

    public static void hienThi() {
        for (NhanVien nv : list) {
            System.out.println(nv);
        }
    }


    private static double getTienLuong() {
        return 0;
    }

    private static String getGmail() {
        return null;
    }

    private static String getSoDT() {
        return null;
    }

    private static String getGioiTinh() {
        return null;
    }

    private static String getTen() {
        System.out.println("Nhập tên");
        return sc.nextLine();
    }

    private static int getTuoi() {
        return 0;
    }


}
