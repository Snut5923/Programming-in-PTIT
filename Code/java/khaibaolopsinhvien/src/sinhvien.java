import java.util.Scanner;

class sinhvien {
    private String masv,hoten,lop,ngaysinh;
    private double gpa;
    sinhvien(){
        masv = "";
        hoten = "";
        lop = "";
        ngaysinh ="";
        gpa = 0;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        hoten = sc.nextLine();
        lop = sc.next();
        ngaysinh = sc.next();
        masv ="B20DCCN001";
        gpa = sc.nextDouble();
    }
    public void sua(){
        if(ngaysinh.length()<10){
            StringBuilder sb = new StringBuilder();
            if(ngaysinh.length()==8){
                sb.append("0");
                sb.append(ngaysinh.substring(0,2));
                sb.append("0");
                sb.append(ngaysinh.substring(2,8));
            }
            else{
                if(ngaysinh.charAt(1)=='/'){
                    sb.append("0");
                    sb.append(ngaysinh);
                }
                else{
                    sb.append(ngaysinh.substring(0,3));
                    sb.append("0");
                    sb.append(ngaysinh.substring(3,9));
                }
            }
            ngaysinh = sb.toString();
        }
    }
    public void in(){
        System.out.print(masv+" "+hoten+" "+lop+" "+ngaysinh+" "+String.format("%.2f",gpa));
    }
}
