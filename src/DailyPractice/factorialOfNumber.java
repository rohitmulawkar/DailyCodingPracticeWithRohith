package DailyPractice;
import java.util.Scanner;
public class factorialOfNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num =  sc.nextInt();
         factorial(num);
    }
   public static void factorial(int num){
        int fact =num ;
       {
        for (int i= num-1; i>0 ; i--){
             fact= fact * i;// using same value for factorial
                    }
           System.out.println(fact);
        //retun fact;
       }


   }


}
