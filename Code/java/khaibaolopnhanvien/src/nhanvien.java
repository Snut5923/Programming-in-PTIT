import java.util.Scanner;

class nhanvien {
    private String manv,hoten,ngaysinh,diachi,thue,ngayki;
    private String sex;
    nhanvien(){
        Scanner sc = new Scanner(System.in);
        hoten = sc.nextLine();
        sex = sc.next();
        ngaysinh = sc.next();
        sc.nextLine();
        diachi = sc.nextLine();
        thue = sc.next();
        ngayki = sc.next();
        manv = "00001";
    }
    public void in(){
        System.out.println(manv+" "+hoten+" "+sex+" "+ngaysinh+" "+diachi+" "+thue+" "+ngayki);
    }
}
