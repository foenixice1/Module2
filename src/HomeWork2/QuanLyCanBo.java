package HomeWork2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class QuanLyCanBo {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<CanBo> list = new ArrayList<>();


    public static void themCanBo() {
        while (true) {
            System.out.println("Thêm công nhân viên chức");
            System.out.println("1 . Công nhân");
            System.out.println("2 . Kỹ sư . ");
            System.out.println("3 . Nhân viên");
            System.out.println("4 . Exit");
            int choice = Integer.parseInt(scanner.nextLine());
            if (choice == 4) {
                return;
            }
            switch (choice) {
                case 1:
                    themCongNhan();
                    break;
                case 2:
                    themKySu();
                    break;
                case 3:
                    themNhanVien();
            }

        }
    }

    public static void themCongNhan() {
        System.out.println("Nhập họ tên Công nhân");
        String hoTen = scanner.nextLine();
        System.out.println("Nhập năm sinh");
        String namSinh = scanner.nextLine();
        System.out.println("Nhập giới tính");
        String gioiTinh = scanner.nextLine();
        System.out.println("Nhập địa chỉ");
        String diaChi = scanner.nextLine();
        System.out.println("Nhập bậc :");
        String Bac = scanner.nextLine();
        System.out.println("Nhập ngành");
        String Nganh = scanner.nextLine();
        list.add(new CongNhan(hoTen, gioiTinh, diaChi, Bac, Nganh));
    }

    public static void themKySu() {
        System.out.println("Nhập họ tên Công nhân");
        String hoTen = scanner.nextLine();
        System.out.println("Nhập năm sinh");
        String namSinh = scanner.nextLine();
        System.out.println("Nhập giới tính");
        String gioiTinh = scanner.nextLine();
        System.out.println("Nhập địa chỉ");
        String diaChi = scanner.nextLine();
        System.out.println("Nhập bậc :");
        String Bac = scanner.nextLine();
        System.out.println("Nhập ngành");
        String Nganh = scanner.nextLine();
        list.add(new KySu(hoTen, namSinh, gioiTinh, diaChi, Bac, Nganh));

    }

    public static void themNhanVien() {
        System.out.println("Nhập họ tên Công nhân");
        String hoTen = scanner.nextLine();
        System.out.println("Nhập năm sinh");
        String namSinh = scanner.nextLine();
        System.out.println("Nhập giới tính");
        String gioiTinh = scanner.nextLine();
        System.out.println("Nhập địa chỉ");
        String diaChi = scanner.nextLine();
        System.out.println("Nhập bậc :");
        String Bac = scanner.nextLine();
        System.out.println("Nhập ngành");
        String Nganh = scanner.nextLine();
        list.add(new NhanVien(hoTen, namSinh, gioiTinh, diaChi, Bac, Nganh));
    }

    public static void timCanBo() {
        System.out.println("Nhập tên cần tìm");
        String hoTen = scanner.nextLine();
        int index = list.indexOf(hoTen);
        if (index < 0)
            System.out.println("Không có kết quả");
        else
            System.out.println(list.get(index));

    }

    public static void xoaNhanVien() {
        System.out.println("Nhập tên nhân viên muốn đuổi");
        String hoTen = scanner.nextLine();
        for (CanBo nhanVien : list) {
            if (nhanVien instanceof NhanVien && nhanVien.getHoTen().equals(hoTen)) ;
            list.remove(nhanVien);
        }
    }

    public static void suaCanBo() {
        System.out.println("Nhập tên cán bộ cần sửa");
        String hoTenCu = scanner.nextLine();
        System.out.println("Nhập thông tin mới");
        System.out.println("Nhập họ tên");
        String hoTen = scanner.nextLine();
        System.out.println("Nhập năm sinh");
        String namSinh = scanner.nextLine();
        System.out.println("Nhập giới tính");
        String gioiTinh = scanner.nextLine();
        System.out.println("Nhập địa chỉ");
        String diaChi = scanner.nextLine();
        System.out.println("Nhập bậc ");
        String Bac = scanner.nextLine();
        System.out.println("Nhập ngành");
        String Nganh = scanner.nextLine();
        NhanVien nhanVien = new NhanVien(hoTen, namSinh, gioiTinh, diaChi, Bac, Nganh);
        int index = list.indexOf(hoTenCu);
        list.set(index, nhanVien);
    }

    public static void hienThiCanBo() {
        for (CanBo canbo : list) {
            canbo.hienthi();
        }
    }

    public static void timKiemNganh() {
        System.out.println("Nhập ngành");
        String Nganh = scanner.nextLine();
        for (CanBo element : list) {
            if (element instanceof CongNhan) {
                if (((CongNhan) element).getNganh().equals(Nganh)) ;
                element.hienthi();
            }
        }
    }

    public static void sapXepCanBo() {
        list.sort(new Comparator<CanBo>() {
            @Override
            public int compare(CanBo o1, CanBo o2) {
                return o1.getHoTen().compareTo(o2.getHoTen());
            }
        });
    }
}
