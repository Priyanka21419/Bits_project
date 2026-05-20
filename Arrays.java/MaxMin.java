package Arrays;
 
public class MaxMin {


    public static void main(String[] args) {
       int arr = {2,3,7,12,3,5};

       int min = arr[0];
       int max = arr[0];

       for(int i = 1;i<arr.length;i++){
        if(arr(i) < min){
            min = arr[1];
        }

        if(arr[i] > max){
            max = arr[i];
        }
    }
    System.out.println("Min: +"+min + "Max: "max);
  }
}