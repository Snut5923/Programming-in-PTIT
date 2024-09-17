import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class tongchuso {
    public static void main(String[] args) throws IOException,ClassNotFoundException {
        ObjectInputStream sc = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String> a = (ArrayList<String>) sc.readObject();
        for(String x : a){
            int tong = 0;
            StringBuilder sb = new StringBuilder();
            char[] c = x.toCharArray();
            for(int i=0;i<c.length;i++){
                if(Character.isDigit(c[i])){
                    tong += (c[i] - '0');
                    sb.append(c[i]);
                }
            }
            String s = sb.toString();
            char[] d = s.toCharArray();
            int tmp =0;
            while(tmp < d.length && d[tmp]=='0'){
                tmp++;
            }
            if(tmp == d.length) System.out.println("0 "+tong);
            else{
                for(int i=tmp;i<d.length;i++){
                    System.out.print(d[i]);
                }
                System.out.println(" "+tong);
            }
        }
    }
}
