class Point {
    static int X_MIN;
    static int Y_MIN;
    static int X_MAX;
    static int Y_MAX;
    
    private int x;
    private int y;
    
    public Point() {
        this.x = 0;
        this.y = 0;
    }
    
    public int getX() {
        return this.x;
    }
    
    public int getY() {
        return this.y;
    }
    
    public void move(int x, int y) {
        int x2 = this.x + x;
        int y2 = this.y + y;
        if (x2 >= X_MIN && x2 <= X_MAX && y2 >= Y_MIN && y2 <= Y_MAX) {
            this.x += x;
            this.y += y;
        }
    }
}
