package DailyPractice;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println("Enter a Number");
        Scanner sc = new Scanner(System.in);
        long original_num= sc.nextInt();
        long num=original_num;
        long num3=0;
       while(num>0){
           long num2= (int) (num%10);  // 1,4,1
            num3=num3*10+num2; //1,14,141
            num =num/10; //14,1,0

        }
       if(num3==original_num){
        System.out.println("The given number is palindrome number");}
       else{

           System.out.println("Not a palindome");
       }
    }
}
