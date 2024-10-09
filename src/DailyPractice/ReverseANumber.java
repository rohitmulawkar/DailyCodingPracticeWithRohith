package DailyPractice;

import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num1 = sc.nextInt();
        int num2 =0;
        while(num1>0){
            num2=num2*10+num1%10  ; //5,53,532
            num1 = num1/10 ; //23, 2,0
                  }
        System.out.println("Reverse of number is "+num2);
    }

}
