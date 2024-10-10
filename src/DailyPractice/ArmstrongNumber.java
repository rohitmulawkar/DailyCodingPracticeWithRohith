package DailyPractice;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int original_num = sc.nextInt();
        sc.close();
        int num = original_num;
        if(num>0){
        double sum = 0;  // variable to store the calculations
       int digits = String.valueOf(num).length();
       while (num > 0) {
            sum += (Math.pow((num%10),digits)) ;
            num = num / 10;
        }
                 if (original_num == (int) sum)
                System.out.println(original_num+" is Armstrong Number");
             else
                System.out.println(original_num + " is not Armstrong Number");

        }
        else System.out.println("Please enter positive number");
    }}
