package Arrays;

import java.util.Scanner;

public class SumOfElements {

    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i = 0; i<arr.length;i++){
            System.out.print("insert the element of position " + i);
            arr[i] = sc.nextInt();
    }

    int sum = 0;
    for(int i = 0;i<arr.length;i++){
        sum = sum + arr[i];
    }

    System.out.println();
}
}