package DailyPractice;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        System.out.println("Please enter your word");
        Scanner scanner = new Scanner(System.in);
        String word= scanner.next();
        String reverse ="";
        for(int i=word.length()-1; i>=0;i--){
           char c= word.charAt(i);
           reverse=reverse+ Character.toString(c);;
        }
        if (word.equals(reverse)) {
            System.out.println("Palindrome String" );
                    }
        else{
            System.out.println("Not a palindrome");
        }        }

    }

