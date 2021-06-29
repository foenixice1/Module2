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
        while (true) {
            try {
                System.out.println("Nhập lương : ");
                return Double.parseDouble(sc.nextLine());
            }catch (Exception e) {
                System.out.println("Sai định dạng");
            }
        }
    }

    private static String getGmail() {
        while (true) {
            try {
                System.out.println("Nhập gmail :");
                String gmail = sc.nextLine();
                for ( NhanVien nv : list) {
                    if ( nv.getGmail().equals(gmail));
                    throw new Gmail();
                }
                return gmail;
            }catch (Gmail e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static String getSoDT() {
        System.out.println("Nhập số điện thoại");
        return sc.nextLine();
    }

    private static String getGioiTinh() {
        while (true) {
            try {
                System.out.println("Nhập giới tính (Nam/Nu)");
                String gioTinh = sc.nextLine();
                if (gioTinh.equals("Nam") || gioTinh.equals("Nu")) {
                    return gioTinh;

                } else throw new GioiTinh();
            } catch (GioiTinh e) {
                System.out.println(e.getMessage());
            }
        }
    }


    private static String getTen() {
        System.out.println("Nhập tên");
        return sc.nextLine();
    }

    private static int getTuoi() {
        while (true) {
            try {
                System.out.println("Nhập tuổi :");
                int tuoi = Integer.parseInt(sc.nextLine());
                if (tuoi < 18) throw new DoTuoi();
                else return tuoi;
            } catch (DoTuoi e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("Sai định dạng");
            }
        }
    }


}
