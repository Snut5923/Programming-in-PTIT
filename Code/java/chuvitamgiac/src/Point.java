class Point {
    private double x,y;
    Point(){
        x = 0;
        y = 0;
    }
    public void Point(double x,double y){
        this.x = x;
        this.y = y;
    }
    public void Point(Point A){
        A.x = this.x;
        A.y = this.y;
    }
    public double getX(){
        return x;
    }

    public double getY() {
        return y;
    }
    public double distance(Point A){
        return Math.sqrt((this.x-A.x)*(this.x-A.x)+(this.y-A.y)*(this.y-A.y));
    }
    public double distance(Point A,Point B){
        return Math.sqrt((B.x-A.x)*(B.x-A.x)+(B.y-A.y)*(B.y-A.y));
    }
}
