class Rectange {
    private double width;
    private double height;
    private String color;
    Rectange(){
        this.width = 1;
        this.height = 1;
    }
    public void Rectange(double width, double height, String color){
        this.height = height;
        this.color = color;
        this.width = width;
    }
    public double getWidth(){
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double getHeight(){
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public double findArea(){
        return width*height;
    }
    public double findPerimeter(){
        return 2*(width+height);
    }
}
