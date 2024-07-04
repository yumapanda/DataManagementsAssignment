public class MergeSort implements Strategy {
    @Override
    public void sort(int[] data) {
        if (data.length < 2) {
            return;
        }
        int mid = data.length / 2;
        int[] left = new int[mid];
        int[] right = new int[data.length - mid];

        System.arraycopy(data, 0, left, 0, mid);
        System.arraycopy(data, mid, right, 0, data.length - mid);

        sort(left);
        sort(right);
        merge(data, left, right);
    }

    private void merge(int[] data, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                data[k++] = left[i++];
            } else {
                data[k++] = right[j++];
            }
        }
        while (i < left.length) {
            data[k++] = left[i++];
        }
        while (j < right.length) {
            data[k++] = right[j++];
        }
    }
}
