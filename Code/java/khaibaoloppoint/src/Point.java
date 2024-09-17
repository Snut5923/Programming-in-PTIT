class Point {
    private double x,y,d;
    Point(){
        this.x = 0;
        this.y = 0;
    }
    public Point(double x,double y){
        this.x = x;
        this.y = y;
    }
    Point(Point a){
        this.x = a.x;
        this.y = a.y;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public double distance(Point a){
        return Math.sqrt((this.x - a.x) * (this.x - a.x) + (this.y - a.y) * (this.y - a.y));
    }
    public void setdist(double d){
        this.d = d;
    }
    public String toString(){
        return String.format("%.4f",this.d);
    }
}
