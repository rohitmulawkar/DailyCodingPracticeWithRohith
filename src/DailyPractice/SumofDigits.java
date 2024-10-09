package DailyPractice;

import java.util.Scanner;

public class SumofDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num3=0;

        while (num>0){
            int num2 = num %10;
            num=num/10;
            num3=num2+num3;

        }
        System.out.println(num3);
    }
}
