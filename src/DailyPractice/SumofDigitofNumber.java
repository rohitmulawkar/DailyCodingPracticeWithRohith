package DailyPractice;
import java.util.Scanner;
public class SumofDigitofNumber {
    public static void main(String [] args){
    Scanner scan =new Scanner(System.in);
    System.out.println("Enter a number: ");
    long a= scan.nextInt();
    int sum=0;
    long b=0;
    while(a>0){
        b=a%10;
        a=a/10;
        sum=sum+(int)b;
    }
        System.out.println(sum);
    }

}
