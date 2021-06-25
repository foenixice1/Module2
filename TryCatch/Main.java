package TryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        KiemTraTamGiac test = new KiemTraTamGiac();
        while (true) {
            Scanner sc = new Scanner(System.in);
            try {
                System.out.println("Nhập cạnh a : ");
                int a = sc.nextInt();
                System.out.println("Nhập cạnh b : ");
                int b = sc.nextInt();
                System.out.println("Nhập cạnh c : ");
                int c = sc.nextInt();
                test.check(a,b,c);
                System.out.println("Đây là một tam giác");
                System.exit(0);
            }catch (KiemTraTamGiac e) {
                System.err.println(test.message());
            }catch (InputMismatchException e) {
                System.err.println("Vui lòng không nhập số âm");
            }
        }
    }

}

