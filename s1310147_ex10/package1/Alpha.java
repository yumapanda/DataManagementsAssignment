package package1;

public class Alpha {
    private int x = 120;
    protected int u = 30;
    int z = 86;

    public void show(Gamma g) {
        System.out.println("Alpha");
        System.out.println("u: " + u);
        System.out.println("v: " + g.v);
        System.out.println("w: " + g.w);
        System.out.println("x: " + x);
        System.out.println("z: " + z);
        System.out.println();
    }
}
