import java.util.Arrays;

public class ReverseManipulation extends ArrayManipulation {
    public ReverseManipulation(ArrayOperation arrayOperation) {
        super(arrayOperation);
    }

    @Override
    public int[] operate(int[] array) {
        int[] result = arrayOperation.operate(array);
        for (int i = 0; i < result.length / 2; i++) {
            int temp = result[i];
            result[i] = result[result.length - 1 - i];
            result[result.length - 1 - i] = temp;
        }
        return result;
    }
}
