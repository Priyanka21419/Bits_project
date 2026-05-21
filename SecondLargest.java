public class SecondLargest {
    public static int solution(int[] arr){

        int largest = Integer.MIN_VALUE;
        int SecondLargest = Integer.MIN_VALUE;

        for(int i = 0;i<arr.length;i++){
            if(arr[i] > largest){
                SecondLargest = largest;
                largest = arr[i];
            }else if(arr[i] < largest && arr[i] > SecondLargest){
                SecondLargest = arr[i];
            }
        }
          return SecondLargest;


    }
            public static void main(String[] args) {
                int[] arr = {8,12,7,-1};
            

                System.out.println(solution(arr));
            }
}