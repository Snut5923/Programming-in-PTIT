import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class gobanphim {
    static boolean check(Character c){
        return c.equals('<') || c.equals('>') || c.equals('-');
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        LinkedList<Character> list = new LinkedList<>();
        String s = sc.next();
        ListIterator<Character> iter = list.listIterator();
        for (char value : s.toCharArray()) {
            if (check(value)) {
                if (value == '>'){
                    if(iter.hasNext()){
                        iter.next();
                    }
                }
                if (value == '<'){
                    if(iter.hasPrevious()){
                        iter.previous();
                    }
                }
                if(value == '-'){
                    if(iter.hasPrevious()){
                        iter.previous();
                        iter.remove();
                    }
                }
            } else {
                iter.add(value);
            }
        }
        for(char x : list){
            System.out.print(x);
        }
        System.out.println();
    }
}
