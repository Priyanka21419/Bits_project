import java.util.Scanner;

public class CheckArmstrongNumber {

public static boolean solution(int num){
     
    // step 1: get count of digits
    int temp = num;
    int count = 0;

    while(temp){
        count++;
        temp = temp / 10;
    }

   // step 2: caluculate the consicutive sum of all
   temp = num;
   double result = 0;
   while(temp != 0){
        int digit = temp % 10;
        result = result + Math.pow(digit, count);
        temp /= 10;
   }


   System.out.println(result + " "+ num);
   return result == num;
}

