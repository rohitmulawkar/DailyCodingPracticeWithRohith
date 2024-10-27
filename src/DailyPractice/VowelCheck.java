package DailyPractice;
import java.util.Scanner;
public class VowelCheck {

        public  static void main(String args[]){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a alphabet only");
            char input= scanner.next().charAt(0);
            input=Character.toLowerCase(input);
            scanner.close();
            System.out.println(input);
            {
                if (input == 'a' || input == 'e' || input == 'i' || input == 'o' || input == 'u') {
                    System.out.println("its a vowel");
                } else {
                    System.out.println("its not a vowel");
                }
            }

        }

}
