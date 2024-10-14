package DailyPractice;

import java.util.Scanner;

public class SwapVariables {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter variable 1");
        int var1 = sc.nextInt();
        System.out.println("Enter variable 2");
        int var2 = sc.nextInt();
        sc.close();
        var1 = var1+var2; // 11
        var2 = var1-var2 ; // 5
        var1=var1-var2;
        System.out.println("var1: "+var1);
        System.out.println("var2: "+var2);

    }
}
