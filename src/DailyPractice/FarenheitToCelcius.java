package DailyPractice;

import java.util.Scanner;

public class FarenheitToCelcius {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter temperature in°F");
        float faranheit = sc.nextFloat();
        sc.close();
        float celcius = (float) ((float)(faranheit-32.0f)*(5.0/9.0));
        System.out.println("The temperature in Faranheigt is " +celcius+"°C");



}}
