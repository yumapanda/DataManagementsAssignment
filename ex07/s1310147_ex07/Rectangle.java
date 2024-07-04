class Rectangle implements Relatable {
    private Point topLeft;
    private Point bottomRight;

    public Rectangle(Point topLeft, Point bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public double getArea() {
        double width = Math.abs(topLeft.getX() - bottomRight.getX());
        double height = Math.abs(topLeft.getY() - bottomRight.getY());
        return width * height;
    }

    public int isLargerThan(Relatable other) {
        Rectangle otherRect = (Rectangle) other;
        double thisArea = this.getArea();
        double otherArea = otherRect.getArea();

        if (thisArea < otherArea) {
            return -1;
        } else if (thisArea > otherArea) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean isSmallerThan(Relatable other) {
        Rectangle otherRect = (Rectangle) other;
        double thisArea = this.getArea();
        double otherArea = otherRect.getArea();

        return thisArea < otherArea;
    }
}
