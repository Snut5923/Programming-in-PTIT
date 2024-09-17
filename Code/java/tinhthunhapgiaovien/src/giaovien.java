import java.util.Scanner;

class giaovien {
    private int heso;
    private String ten;
    private int luong;
    private String magv;
    private int trocap;
    giaovien(){
        Scanner sc = new Scanner(System.in);
        magv = sc.next();
        sc.nextLine();
        ten = sc.nextLine();
        luong = sc.nextInt();
    }
    public void doi(){
        String a = magv.substring(0,2);
        String b = magv.substring(2,4);
        if(a.equals("HT")){
            trocap = 2000000;
        }
        else{
            if(a.equals("HP")){
                trocap = 900000;
            }
            else trocap = 500000;
        }
        int x = 0;
        char[] c = b.toCharArray();
        for(int i=0;i<c.length;i++){
            x = x*10 + (c[i]-'0');
        }
        heso = x;
    }
    public void in(){
        System.out.println(magv+" "+ten+" "+heso+" "+trocap+" "+(trocap+luong*heso));
    }
}
