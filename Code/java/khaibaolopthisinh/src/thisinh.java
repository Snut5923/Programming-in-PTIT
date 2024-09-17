import java.util.Scanner;

class thisinh {
    private String hoten;
    private String ngaysinh;
    private double diem1,diem2,diem3;
    thisinh(){
        Scanner sc = new Scanner(System.in);
        hoten = sc.nextLine();
        ngaysinh = sc.next();
        diem1 = sc.nextDouble();
        diem2 = sc.nextDouble();
        diem3 = sc.nextDouble();
    }
    public void in(){
        System.out.print(hoten+" "+ngaysinh+" "+(diem1+diem2+diem3));
    }
}
