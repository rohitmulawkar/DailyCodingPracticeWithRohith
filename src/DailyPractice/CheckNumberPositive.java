package DailyPractice;

import java.util.Scanner;

public class CheckNumberPositive {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number");
        int number = sc.nextInt();
        sc.close();
        if (number==0){
            System.out.println("Number entered is zero");

        }
        else if (number>0){
            System.out.println("Number entered is positive");
        }
        else{
            System.out.println("Number entered is negative");
        }

}}
