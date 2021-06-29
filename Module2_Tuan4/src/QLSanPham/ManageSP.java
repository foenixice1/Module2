package QLSanPham;

import java.util.List;
import java.util.Scanner;

public class ManageSP {
    static Scanner sc = new Scanner(System.in);
    private List<SanPham> sanPhams;
    private SanPhamDocGhi sanPhamDocGhi;

    public ManageSP() {
        sanPhamDocGhi = new SanPhamDocGhi();
        sanPhams = sanPhamDocGhi.docFile();
    }

    public void hienThi() {
        for (SanPham sp : sanPhams) {
            sp.hienThi();
        }
    }

    public void add() {
        System.out.println("Nhập mã sản phẩm");
        int maSP = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tên sản phẩm");
        String tenSP = sc.nextLine();
        System.out.println("Nhập hãng sản xuất");
        String hangSX = sc.nextLine();
        System.out.println("Nhập giá sản phẩm");
        int giaSP = Integer.parseInt(sc.nextLine());
        System.out.println("Mô tả sản phẩm");
        String moTa = sc.nextLine();
        sanPhams.add(new SanPham(maSP, tenSP, hangSX, giaSP, moTa));
        sanPhamDocGhi.ghiFile(sanPhams);

    }

    public void timSP() {
        System.out.println("Nhập tên sản phẩm cần tìm");
        String tenSP = sc.nextLine();
        int index = sanPhams.indexOf(tenSP);
        if (index < 0) System.out.println("Không có kết quả");
        else System.out.println(sanPhams.get(index));
    }
}
