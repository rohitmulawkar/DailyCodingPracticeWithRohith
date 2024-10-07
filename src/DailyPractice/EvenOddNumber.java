package DailyPractice;


import java.util.Scanner;

public class EvenOddNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a numbers");
        int num = sc.nextInt();         //Take input from user
        if (num%2==0){                      // logic if the reminder is zero when divided by 2
            System.out.println("The number is even number");

        }
        else {
            System.out.println("The number is odd number");

        }
    }
}
