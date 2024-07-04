import java.util.Random;

public class ShuffleManipulation extends ArrayManipulation {
    public ShuffleManipulation(ArrayOperation arrayOperation) {
        super(arrayOperation);
    }

    @Override
    public int[] operate(int[] array) {
        int[] result = arrayOperation.operate(array);
        Random rand = new Random();
        for (int i = 0; i < result.length; i++) {
            int randomIndexToSwap = rand.nextInt(result.length);
            int temp = result[randomIndexToSwap];
            result[randomIndexToSwap] = result[i];
            result[i] = temp;
        }
        return result;
    }
}
