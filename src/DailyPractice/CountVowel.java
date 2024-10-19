    package DailyPractice;

    import java.util.Scanner;

    public class CountVowel {
        public static void main(String[] args) {
            System.out.println("Please enter your word");


            Scanner scanner = new Scanner(System.in);
            String word = scanner.next();
            int j = 0;
            for (int i = word.length() - 1; i >= 0; i--) {
                char c = word.charAt(i);
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    j++;

                }
            }
            System.out.println(j);
        }
    }


