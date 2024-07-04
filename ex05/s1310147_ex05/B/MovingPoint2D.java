class MovingPoint2D {
    private Point2D point;
    private double vx;
    private double vy;

    public MovingPoint2D(double x, double y, double vx, double vy) {
        this.point = new Point2D(x, y);
        this.vx = vx;
        this.vy = vy;
    }

    public void setVelocity(double vx, double vy) {
        this.vx = vx;
        this.vy = vy;
    }

    public void move() {
        point.x += vx;
        point.y += vy;
    }

    public double distance(MovingPoint2D other) {
        return point.distance(other.point);
    }

    @Override
    public String toString() {
        return point.toString();
    }
}
