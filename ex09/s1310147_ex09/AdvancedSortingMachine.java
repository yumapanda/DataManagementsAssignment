public class AdvancedSortingMachine extends SortingMachine {
    public AdvancedSortingMachine(Strategy s) {
        super(s);
    }

    @Override
    public void sort(int[] data) {
        long startTime = System.currentTimeMillis();
        System.out.println(strategy.getClass().getName());
        strategy.sort(data);
        long endTime = System.currentTimeMillis();
        System.out.println("time: " + (endTime - startTime));
    }
}
