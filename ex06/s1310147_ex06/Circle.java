class Circle extends Shape {
    private Point center;
    private int radius;

    public Circle(Point c, int r) {
        this.center = c;
        this.radius = r;
    }

    public void print() {
        super.print();
        System.out.println("(" + center.getX() + ", " + center.getY() + ") radius = " + radius);
    }

    public void move(int dx, int dy) {
        center.move(dx, dy);
    }
}