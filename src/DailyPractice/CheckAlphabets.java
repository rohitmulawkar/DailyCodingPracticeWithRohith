package DailyPractice;

import java.util.Scanner;

public class CheckAlphabets {
  public static void main (String args[]){
      Scanner scanner= new Scanner (System.in);
      System.out.println("Enter a character ");
      String input = scanner.next();
      char c= input.toUpperCase().charAt(0); // Taking first char as input and convert into upper case
          int ascii= (int) c;

      scanner.close();
      if( ascii>=65 && ascii<=90){
          System.out.println("its an alphabet");
      }
else {
          System.out.println("Its not an alphabet");
      }


  }

  }

