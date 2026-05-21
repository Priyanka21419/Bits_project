import java.util.Arrays;

public class LeftRotationByOne {
    public static void solution(int[] arr) {

        int size = arr.length;

        int temp = arr[0];

        // Shift elements to left
        for (int i = 1; i < size; i++) {
            arr[i - 1] = arr[i];
        }

        // Put first element at last
        arr[size - 1] = temp;
    }

    public static void main(String[] args) {

        int[] arr = {-1, 0, -2, 4, 8, 10};

        solution(arr);

        System.out.println(Arrays.toString(arr));
    }
}
