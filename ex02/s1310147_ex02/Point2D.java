import java.lang.Math;

class Point2D{
    private double x;
    private double y;

    public Point2D(){
        this.x = 0.0;
        this.y = 0.0;
    }

    public Point2D(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX(){
        return x;
    }

    public void setX(double x){
        this.x = x;
    }

    public double getY(){
        return y;
    }

    public void setY(double y){
        this.y = y;
    }

    public void add(Point2D vector){
        this.x += vector.getX();
        this.y += vector.getY();
    }

    public void scale(double factor){
        this.x *= factor;
        this.y *= factor;
    }

    public double length(){
        return Math.sqrt(x * x + y *y);
    }

    public double dotProduct(Point2D vector){
        return this.x * vector.getX() + this.y * vector.getY();
    }

    public double crossProduct(Point2D vector){
        return this.x * vector.getY() - this.y * vector.getX();
    }
}