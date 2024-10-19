import java.util.Scanner;

public class LargestElementInArray {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int[] a =new int[5];
        int largest=0;
        for(int i=0;i<a.length;i++) {
            System.out.println("Enter a number ");
            a[i] = scanner.nextInt();
            if (a[i] > largest) {
                largest = a[i];

            }
            System.out.println(largest);
        }   }
}
