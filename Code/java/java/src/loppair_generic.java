import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class loppair_generic {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
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
class Pair<T,N>{
    private T first;
    private N second;
    public Pair(T first,N second){
        this.first = first;
        this.second = second;
    }
    public boolean nt(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return (n>1);
    }
    public boolean isPrime(){
        return nt((Integer) this.first) && nt((Integer) this.second);
    }
    @Override
    public String toString(){
        String s = " ";
        s+=first+" "+second;
        return s;
    }
}