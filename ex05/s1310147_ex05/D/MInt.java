class MInt extends Int {
    public static final int MOD = 107;

    public MInt(int x) {
        super(x);
    }

    @Override
    public Int add(Int a) {
        return new MInt((x + a.getValue()) % MOD);
    }

    @Override
    public Int mul(Int a) {
        return new MInt((x * a.getValue()) % MOD);
    }
}
