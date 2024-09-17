import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class test {
    public static String doi(long x) throws ParseException{
        StringBuilder sb = new StringBuilder();
        sb.append(x/3600);
        sb.append(":");
        x = x % 3600;
        sb.append(x/60);
        sb.append(":");
        x = x % 60;
        sb.append(x);
        return sb.toString();
    }
    public static void main(String[] args) throws ParseException{
        SimpleDateFormat sd = new SimpleDateFormat("HH:mm:ss");
        Date x;
        System.out.println(sd.parse("00:06:01").getSeconds());
        // x = sd.parse(doi(sd.parse("07:10:01").getTime()-sd.parse("07:00:00").getTime()));
        // // x = sd.parse(doi(601));
        // System.out.println(sd.format(x));
    }
}
