class hang {
    private String ma,ten,donvi;
    private double gianhap,soluong;
    public hang(int i,String ten,String donvi,String gianhap,String soluong){
        this.ma = String.format("MH%02d", i);
        this.ten = ten;
        this.donvi = donvi;
        this.gianhap = Double.parseDouble(gianhap);
        this.soluong = Double.parseDouble(soluong);
    }
    public long phivanchuyen(){
        return Math.round((gianhap*soluong)*0.05);
    }
    public long thanhtien(){
        return Math.round(gianhap*soluong+phivanchuyen());
    }
    public long giaban(){
        return Math.round(thanhtien() + 0.02*thanhtien());
    }
    @Override
    public String toString(){
        return ma+" "+ten+" "+donvi+" "+phivanchuyen()+" "+thanhtien()+" "+giaban();
    }
}
