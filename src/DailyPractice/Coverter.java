package DailyPractice;

import java.util.Scanner;

public class Coverter {
    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in); // to take input from the user
        double value=0;
        System.out.println("Please enter 1 for Km to Mile converter and 2 for °F to °C");
        int choice = scanner.nextInt();
        if (choice <=2 && choice>=1){
        System.out.println("Please enter your value (Temperature / Distance) ");
         value = scanner.nextDouble();}
        switch (choice){
            case 1 :
                System.out.println(" The distance in miles is :"+(value*0.62137));break;
            case 2 :
                System.out.println(" The temperature in °C is :"+((value-32)*(5.0/9.0)));break;
            default:
                System.out.println("Please enter valid choice");


        }

    }

}
