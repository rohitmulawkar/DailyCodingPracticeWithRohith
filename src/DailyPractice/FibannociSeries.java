package DailyPractice;

import java.util.Scanner;

public class FibannociSeries {
    public static void main(String[] args) {
        int first= 0;
        int second =1;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the series count");
        int seriesCount = sc.nextInt();
        sc.close();
        int i=1;
        while(i<=seriesCount){
           int num3= first+ second; //1 ,2 ,3,5
            System.out.print(" "+first);
            first = second; // 1,1,2,
            second = num3; // 1,2,3
                 i++;
        }

    }

}
