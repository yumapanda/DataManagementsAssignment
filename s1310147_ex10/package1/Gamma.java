package package1;

public class Gamma {
    public int v = 1000;
    protected int w = 777;

    public void show(Alpha a) {
        System.out.println("Gamma");
        System.out.println("u: " + a.u);
        System.out.println("v: " + v);
        System.out.println("w: " + w);
        System.out.println("z: " + a.z);
        System.out.println();
    }
}
