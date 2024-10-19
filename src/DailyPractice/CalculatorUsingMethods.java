package DailyPractice;

import java.util.Scanner;

public class CalculatorUsingMethods {
    public static void main(String[] args) {
        System.out.println("Enter first Number");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("Enter second Number");
        int b = scanner.nextInt();

        System.out.println("sum " + sum(a, b));
        System.out.println("Division :" + div(a, b));
        System.out.println("Substraction " + substtract(a, b));
        System.out.println("Multiplication " + multiply(a, b));


    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static float div(int a, int b) {

        return (float) a / b;
    }

    public static int substtract(int a, int b) {
        return a - b;
    }


}
