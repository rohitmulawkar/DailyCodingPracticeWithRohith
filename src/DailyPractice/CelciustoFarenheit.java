package DailyPractice;

import java.util.Scanner;

public class CelciustoFarenheit {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter temperature in°C");
        float celcius = sc.nextFloat();
        sc.close();
        float faranheit = (float)(celcius*(9.0/5.0))+ 32.0f;
        System.out.println("The temperature in Faranheigt is " +faranheit+"°F");



}}
