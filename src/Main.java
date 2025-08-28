import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner inputStream = new Scanner(System.in);
        System.out.println("Введите желаемое количество строк:");

        int limit = inputStream.nextInt();
        inputStream.nextLine();

        if(limit < 1) {
            System.out.println("Нечего вводить и обрабатывать. Прощайте.");
            return;
        }

        String[] stringArray = new String[limit];

        System.out.println("Введите, последовательно  строки:");
        for(int idx = 0; idx < limit; idx++  ){
            stringArray[idx] = inputStream.nextLine();
        }

        int maxStringIndex = 0;
        int maxDifChars = 0;

        for(int idx = 0; idx < limit; idx++  ){

            String currentString = stringArray[idx].toUpperCase();
            StringBuilder accumulator = new StringBuilder();

            for(char ch : currentString.toCharArray()){

                if(accumulator.indexOf(String.valueOf(ch)) == -1)
                        accumulator.append(ch);
            }

            if(maxDifChars < accumulator.length()){
                maxDifChars = accumulator.length();
                maxStringIndex = idx;
            }

        }
        System.out.println("Количество строк: " + limit);
        for(int idx = 0; idx < limit; idx++  ){
            System.out.println("Строка " + (idx + 1) + ": " + stringArray[idx]);
        }

        System.out.println("Строка с максимальным количеством разных символов: " + stringArray[maxStringIndex]);
    }
}