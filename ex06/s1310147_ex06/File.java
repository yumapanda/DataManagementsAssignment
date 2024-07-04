class File extends Entity {
    private int size;
    public File(String name, int size) {
        super(name);
        this.size = size;
    }
    public void rename(String name) {
        this.name = name;
    }
    @Override
    public int getSize() {
        return size;
    }
    @Override
    public void display() {
        System.out.print(name + " ");
    }
}
