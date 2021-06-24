package ArryListLinkedListFW;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class ProductManager {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Product> list = new ArrayList<>();

    public static void themSanPham() {
        System.out.println("Nhập ID sản phẩm mới");
        int ID = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tên sản phẩm");
        String name = sc.nextLine();
        System.out.println("Nhập giá sản phẩm");
        String gia = sc.nextLine();
        list.add(new Product(ID, name, gia));
    }

    public static void suaSanPham() {
        System.out.println("Nhập ID sản phẩm cần sửa");
        String idCu = sc.nextLine();
        System.out.println("Nhập thông tin mới");
        System.out.println("Tên sản phẩm");
        String name = sc.nextLine();
        System.out.println("Giá sản phẩm");
        String gia = sc.nextLine();
        Product product = new Product(name, gia);
        int index = list.indexOf(idCu);
        list.set(index, product);
    }
    public static void xoaSanPham() {
        System.out.println("Nhập ID sản phẩm cần xóa");
        int ID = sc.nextInt();
        for (Product id : list) {
            if (id instanceof Product && id.equals(ID) ) {
                list.remove(id);
            }
        }
    }
    public static void hienThi() {
        for (Product product : list) {
            product.hienThi();
        }
    }
    public static void timKiemSp() {
        System.out.println("Nhập tên sản phẩm");
        String sanPham = sc.nextLine();
        for (Product element : list) {
            if ( element instanceof Product) {
                if (((Product) element).getName().equals(sanPham));
                element.hienThi();
            }
        }
    }
    public static void sapXepTang() {
        list.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getGia().compareTo(o2.getGia());
            }
        });
    }
    public static void sapXepGiam() {
        list.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o2.getGia().compareTo(o1.getGia());
            }
        });
    }


}
