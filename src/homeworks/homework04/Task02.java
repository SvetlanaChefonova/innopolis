package homeworks.homework04;
import java.util.Scanner;
public class Task02 {
    public static void main(String[] args){

        System.out.println("Введите строку, состоящую только из символов <,>,-\nКоличество символов не более 106:");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        int k = 0;

        int number = string.indexOf(">>-->");
        while (number != -1) {
            string = string.replaceFirst(">>-->", "");
            k++;
            number = string.indexOf(">>-->");
        }

        number = string.indexOf("<<--<");
        while (number != -1) {
            string = string.replaceFirst("<<--<", "");
            k++;
            number = string.indexOf("<<--<");
        }

        System.out.println("Количество стрел: " + k);

        String newString = "";
        int length = string.length();
        if (length > 106) {
            System.out.println("Длина строки не соответствует условию задачи");
        } else if (length < 106) {
            for (int i = 0; i < length; i++) {
                String symbol = Character.toString(string.charAt(i));
                if (symbol.equals("<") || symbol.equals(">") || symbol.equals("-")) {
                    newString = newString + symbol;
                } else {
                    System.out.println("Вы ввели символы, не соответствующие условию задачи. Начните заново");

                    break;
                }
            }
        }
    }
}
