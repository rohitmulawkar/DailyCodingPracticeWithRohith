package DailyPractice;

import java.util.Scanner;

public class simpleInterest {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Principal amount");
        float principal = sc.nextFloat();
        System.out.println("Enter rate of interest ");
        float interest =sc.nextFloat();
        System.out.println("Enter tenure in months");
        int numberOfMonths = sc.nextInt();
        sc.close();
        float simpleInterest= (float) ((principal* interest * (numberOfMonths/12.0)) / 100.0);
        System.out.println("Simple interest is "+simpleInterest);

}}

