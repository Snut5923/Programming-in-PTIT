import java.util.*;

class MatHang implements Comparable<MatHang> {
    String ma, ten, donViTinh;
    int giaMua, giaBan, loiNhuan;

    public MatHang(String ten, String donViTinh, int giaMua, int giaBan, int index) {
        this.ten = ten;
        this.donViTinh = donViTinh;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
        this.loiNhuan = giaBan - giaMua;
        this.ma = String.format("MH%03d", index + 1);
    }

    @Override
    public int compareTo(MatHang other) {
        if (this.loiNhuan == other.loiNhuan) {
            return this.ma.compareTo(other.ma);
        }
        return other.loiNhuan - this.loiNhuan;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + donViTinh + " " + giaMua + " " + giaBan + " " + loiNhuan;
    }
}

public class danhsachmathang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int M = scanner.nextInt();
        scanner.nextLine();
        List<MatHang> danhSach = new ArrayList<>();

        for (int i = 0; i < M; i++) {
            String ten = scanner.nextLine();
            String donViTinh = scanner.nextLine();
            int giaMua = scanner.nextInt();
            int giaBan = scanner.nextInt();
            if (scanner.hasNextLine()) {
                scanner.nextLine();
            }
            danhSach.add(new MatHang(ten, donViTinh, giaMua, giaBan, i));
        }

        Collections.sort(danhSach);

        for (MatHang mh : danhSach) {
            System.out.println(mh);
        }
    }
}