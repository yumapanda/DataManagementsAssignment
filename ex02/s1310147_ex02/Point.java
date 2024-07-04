class Point{
    private int x;
    private int y;

    public Point(){
        this.x = 0;
        this.y = 0;
    }
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public void move(int dx, int dy){
        if(Math.abs(this.x + dx) <= 100 && Math.abs(this.y + dy) <= 100){
            this.x += dx;
            this.y += dy;
        }
    }
}