public class AddMapManipulation extends ArrayManipulation {
    private int addValue;

    public AddMapManipulation(ArrayOperation arrayOperation, int addValue) {
        super(arrayOperation);
        this.addValue = addValue;
    }

    @Override
    public int[] operate(int[] array) {
        int[] result = arrayOperation.operate(array);
        for (int i = 0; i < result.length; i++) {
            result[i] += addValue;
        }
        return result;
    }
}
