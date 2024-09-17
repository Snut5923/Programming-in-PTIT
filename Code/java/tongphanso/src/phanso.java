import java.util.Scanner;

class phanso {
    private long tuso,mauso;
    phanso(long tuso,long mauso){
        this.tuso = tuso;
        this.mauso = mauso;
    }
    public void cong(phanso A){
        tuso = this.tuso*A.mauso+this.mauso*A.tuso;
        mauso = this.mauso * A.mauso;
    }
    public void toigian(){
        long a = tuso;
        long b = mauso;
        long tmp ;
        while(b!=0){
            tmp = a%b;
            a = b;
            b = tmp;
        }
        tuso /= a;
        mauso /= a;
    }
    public void in(){
        System.out.println(tuso+"/"+mauso);
    }
}
