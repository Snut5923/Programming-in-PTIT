import java.util.Scanner;

class phanso {
    private long tuso;
    private long mauso;
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        tuso = sc.nextLong();
        mauso = sc.nextLong();
    }
    public long getTuso(){
        return tuso;
    }

    public long getMauso() {
        return mauso;
    }
}
