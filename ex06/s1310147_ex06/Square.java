class Square extends Rectangle {
    public Square(Point topLeft, int side) {
        super(topLeft, new Point(topLeft.getX() + side, topLeft.getY() + side));
    }
}