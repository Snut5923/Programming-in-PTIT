class nv {
    private String ma,ten,chuc;
    private long ngay,luongngay;
    public nv(int i,String ten,String luongngay,String ngay,String chuc){
        this.ma = String.format("NV%02d",i);
        this.ten = ten;
        this.luongngay = Long.parseLong(luongngay);
        this.ngay = Long.parseLong(ngay);
        this.chuc = chuc;
    }
    public long luongthang(){
        return luongngay*ngay;
    }
    public long thuong(){
        if(ngay >= 25) return luongthang()/5;
        else if(ngay >= 22) return luongthang()/10;
        return 0;
    }
    public long phucap(){
        if(chuc.equals("GD")) return 250000;
        else if(chuc.equals("PGD")) return 200000;
        else if(chuc.equals("TP")) return 180000;
        return 150000;
    }
    public long thuclinh(){
        return luongthang()+thuong()+phucap();
    }
    @Override
    public String toString(){
        return ma+" "+ten+" "+luongthang()+" "+thuong()+" "+phucap()+" "+thuclinh();
    }
}
