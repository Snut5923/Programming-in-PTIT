import java.util.*;
import java.lang.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<time> a = new ArrayList<>();
        while (t-- > 0)
            a.add(new time(sc.nextInt(), sc.nextInt(), sc.nextInt()));
        Collections.sort(a);
        for (time i : a)
            System.out.println(i);
    }
}