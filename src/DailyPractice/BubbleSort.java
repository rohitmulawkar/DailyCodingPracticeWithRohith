package DailyPractice;
import java.util.Scanner;
public class BubbleSort {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int[] a =new int[5];
        int largest=0;
        for(int i=0;i<a.length;i++) {
            System.out.println("Enter a number ");
            a[i] = scanner.nextInt();
 
        }
        for(int i=0;i<a.length-1;i++) {
            if (a[i] < a[i+1]) {
                a[i]=largest;
                a[i+1]=a[i];
                            }
            for (int j=0;j<a.length;j++)
            {
                System.out.println(a[j]);
                }

        }   }
}
