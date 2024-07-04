class Parallelogram extends Quadrangle {
    public Parallelogram(Point p1, Point p2, int base) {
        super(p1, 
              new Point(p1.getX() + base, p1.getY()),
              p2,
              new Point(p2.getX() - base, p2.getY())
        );
    }
}