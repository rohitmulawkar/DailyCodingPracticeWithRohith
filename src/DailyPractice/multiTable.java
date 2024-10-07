package DailyPractice;
import java.util.*;
public class multiTable {

public static void main(String[] args) {

    Scanner sc = new Scanner (System.in);
    System.out.println("Enter the number to get multiplication table ");
    int num = sc.nextInt();
    sc.close();
    for (int i = 1 ; i<11; i++){
        System.out.println(num +"*"+ i+" ="+ (num*i));

    }

}}

