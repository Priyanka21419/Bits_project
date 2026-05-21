import java.util.Scanner;

public class LeftRotationK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = {10, 20, 30, 40, 50};

        System.out.print("Enter K value: ");
        int k = sc.nextInt();

        int n = arr.length;

        // Handle K greater than array size
        k = k % n;

        // Perform left rotation K times
        for (int j = 0; j < k; j++) {
            int first = arr[0];

            for (int i = 0; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }

            arr[n - 1] = first;
        }

        // Print rotated array
        System.out.println("Array after left rotation:");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}