import java.util.Scanner;

public class PrimeOrNotPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number , i will tell you its prime or not");
        int number= scanner.nextInt();
        scanner.close();
        int j=0;
        for(int i=1;i<=number;i++){
            if (number % i==0){
                j++;

            }
        }
        if(j==2){
            System.out.println("its prime number");
                    }
        else {
            System.out.println("Not a prime number");
        }
    }
}
