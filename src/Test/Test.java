package Test;

public class Test {
    public static void main(String[] args) {
//        tìm số chia hết cho 3 nhỏ hơn 300
        int a = 300;
        System.out.println(Test.tong300(a));

    }
    public static double tong300(int a) {
        if (a < 1) {
            return 0;
        } else if (a % 3 != 0) {
            a--;
        } else {
            return a + tong300(a - 3);
        }
        return 0;
    }
//    tính tổng sos nguyên tố từ 1-300.
    public static boolean checkSNT(int a) {
        if (a < 2) return false;
        int squareRoot = (int) Math.sqrt(a);
        for (int i = 2; i <= squareRoot; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
//        viết hàm ktra SNT
    }
    public static double sumSNT(int a) {
        if (a>300) return 0;
        if (checkSNT(a)) return a + sumSNT(a+1);
        else return sumSNT(a+1);
    }
}
