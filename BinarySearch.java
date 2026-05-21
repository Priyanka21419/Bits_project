package day3;

import java.util.Arrays;

public class BinarySearch{

public static boolean solution(int[] arr,int Key){ 

    //sort the array TC: 0(Nlogn) SC: 0(1)
    Arrays.sort(arr);


    int start = 0;
    int end = arr.length - 1;

    while(start < end){

        int mid = start + (end - start) / 2;

        if(key < arr[mid]){
          end = mid - 1;
        }
        else if(key > arr[mid]){
            start = mid + 1;
     }
     else {
        return true; // Element found
     }
 }

 return false; // Element not found
}

public static void main(String[] args) {

    int[] arr = {-1,0,2,4,8,10};  


    if (solution(arr,8)){

    System.out.println("Element is present");
    }
    else {
        System.out.println("Element not found");
    }
}
}
