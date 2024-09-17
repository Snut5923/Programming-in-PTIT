import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            boolean check = false;
            for(int i = 2; i <= 2*Math.sqrt(n); i++){
                Pair<Integer, Integer> p = new Pair<>(i, n-i);
                if(p.isPrime()){
                    System.out.println(p);
                    check = true;
                    break;
                }
            }
            if(!check) System.out.println(-1);
        }
    }
}
class Pair<V,T>{
    private V a;
    private T b;
    public Pair(V a,T b){
        this.a = a;
        this.b = b;
    }
    public boolean nt(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return (n>1);
    }
    public boolean isPrime(){
        if(nt((Integer)a) && nt((Integer)b)) return true;
        return false;
    }
    @Override
    public String toString(){
        return a+" "+b;
    }
}