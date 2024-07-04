public class FileManagerApplication {
    public FileManagerApplication() {
        // create files and directories
        Entity file1 = new File("memo", 80);
        Entity file2 = new File("Robot.java", 322);
        Entity file3 = new File("RobotSimulator.java", 548);
        Entity file4 = new File("p1", 288);
        Entity file5 = new File("p2", 331);
        Entity file6 = new File("p3", 20);
        Entity dir1 = new Directory("Java1");
        Entity dir2 = new Directory("Ex01");
        Entity dir3 = new Directory("Ex02");
        Entity dir4 = new Directory("BACKUP");

        // organize the hierarchy
        ((Directory)dir1).add(file1);
        ((Directory)dir1).add(dir2);
        ((Directory)dir1).add(dir3);
        ((Directory)dir2).add(file2);
        ((Directory)dir2).add(file3);
        ((Directory)dir2).add(dir4);
        ((Directory)dir4).add(file4);
        ((Directory)dir4).add(file5);
        ((Directory)dir4).add(file6);

        // display
        dir1.display();
        dir2.display();

        // make changes
        ((Directory)dir1).add(new File("score", 100));

        // display again
        dir1.display();
        dir2.display();
    }

    public static void main(String[] args) {
        new FileManagerApplication();
    }
}
