class hang implements Comparable<hang>{
    private String ma,ten,donvi;
    private long gianhap,soluong;
    public hang(int i,String ten,String donvi,String gianhap,String soluong){
        this.ma = String.format("MH%02d", i);
        this.ten = ten;
        this.donvi = donvi;
        this.gianhap = Long.parseLong(gianhap);
        this.soluong = Long.parseLong(soluong);
    }
    public long phivanchuyen(){
        return Math.round((gianhap*soluong)*5/100);
    }
    public long thanhtien(){
        return Math.round(gianhap*soluong+phivanchuyen());
    }
    public double giaban(){
    
        double x = (thanhtien() + 0.02*thanhtien())/soluong;
        return x;
    }

    @Override
    public String toString(){
        return ma+" "+ten+" "+donvi+" "+phivanchuyen()+" "+thanhtien()+" "+(long)(Math.ceil(giaban()/100)*100);
    }
    @Override
    public int compareTo(hang x){
        if(giaban() < x.giaban()) return 1;
        return -1;
    }
}