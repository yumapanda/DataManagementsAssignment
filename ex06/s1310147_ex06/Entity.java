abstract class Entity {
    protected String name;
    public Entity(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public abstract int getSize();
    public abstract void display();
}