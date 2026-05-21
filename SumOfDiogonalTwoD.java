public class SumOfDiogonalTwoD {  
    public static int solution(int[][] arr){
         int sum = 0;
        int size = arr.length;

        for(int i = 0; i<size; i++) {
            //primary diogonal i == j
            sum = sum + arr[i][i];

            //secondry diogonal i + j == size -1 -i
            sum = sum + arr[i][size -1 -i];

        }
        if(size % 2 == 1) {
            sum = sum - arr[size/2][size/2];
        
        }
        return sum;
    }
    public static void main(String[] args) {
        int [][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}

        };
        System.out.println(solution (arr));
    }
}