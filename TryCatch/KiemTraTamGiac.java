package TryCatch;

public class KiemTraTamGiac extends Exception {
    public String message() {
        return "Khong la tam giac";
    }

    public void check(Integer side1, Integer side2, Integer side3) throws KiemTraTamGiac {
        if (side1 <= 0 || side2 <= 0 || side3 <= 0 || !(side1 + side2 > side3) || !(side2 + side3 > side1) ||
                !(side1 + side3 > side2)) throw new KiemTraTamGiac();
    }
}
