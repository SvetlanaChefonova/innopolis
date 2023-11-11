package homeworks.homework04;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args){

        try {

        System.out.println("Введите маленькую букву английского алфавита: ");
        Scanner scanner = new Scanner(System.in);
        String letter = scanner.nextLine();


        String alphabet = "qwertyuiopasdfghjklzxcvbnm";
        int index = alphabet.indexOf(letter);
        int lastIndex = index-1;

        if (letter.equals("q")) {
            lastIndex = 25;
        }
            System.out.println("Левая буква: "+ alphabet.charAt(lastIndex));
        } catch (StringIndexOutOfBoundsException exception) {
            System.out.printf("Ошибка: %s\n", exception);
        }

    }

}
