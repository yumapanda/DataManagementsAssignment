class Int {
    protected int x;
    public static final int INT_MAX = 1024;

    public Int(int x) {
        this.x = x;
    }

    public Int add(Int a) {
        return new Int(x + a.getValue());
    }

    public Int mul(Int a) {
        return new Int(x * a.getValue());
    }

    public void setValue(int a) {
        x = a;
    }

    public int getValue() {
        return x;
    }

    @Override
    public String toString() {
        return String.valueOf(x);
    }
}
