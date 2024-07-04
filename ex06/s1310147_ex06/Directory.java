public class Directory extends Entity {
    private Entity[] entities = new Entity[100];
    private int numberOfEntities = 0;

    public Directory(String name) {
        super(name);
    }

    public void add(Entity entity) {
        entities[numberOfEntities++] = entity;
    }

    public int getSize() {
        int total = 0;
        for (int i = 0; i < numberOfEntities; i++) {
            total += entities[i].getSize();
        }
        return total;
    }

    public void display() {
        for (int i = 0; i < numberOfEntities; i++) {
            System.out.print(entities[i].getName() + " ");
        }
        System.out.println();
        System.out.println(this.getSize() + " bytes");
    }
}
