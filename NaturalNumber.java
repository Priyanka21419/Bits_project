import java.util.Scanner;

public class NaturalNumber {
    
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int a;
    System.out.println("Enter a NaturalNumber");
    a = sc.nextInt();
    for(int i=0;i<a;i++){
        System.out.println(i);
    }
  }
}
