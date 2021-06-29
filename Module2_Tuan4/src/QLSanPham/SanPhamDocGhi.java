package QLSanPham;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SanPhamDocGhi {
    public void ghiFile(List<SanPham> sanPhams) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null ;
        try {
            fos = new FileOutputStream(new File("sanpham.txt"));
            oos = new ObjectOutputStream(fos);
            oos.writeObject(sanPhams);
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }finally {
            cloneStream(oos);
        }
    }

    private void cloneStream(ObjectOutputStream oos) {
        if (oos != null) {
            try {
                oos.close();
            }catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public List<SanPham> docFile() {
        List<SanPham> sanPhams = new ArrayList<>();
        FileInputStream fis = null;
        ObjectInputStream ois = null ;
        try {
            fis = new FileInputStream(new File("sanpham.txt"));
            ois = new ObjectInputStream(fis);
            sanPhams = (List<SanPham>) ois.readObject();
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            closeStream(fis);
            closeStream(ois);
        }
        return sanPhams;
    }
    private void closeStream(InputStream is) {
        if (is != null) {
            try {
                is.close();
            }catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
