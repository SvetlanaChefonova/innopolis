package homeworks.homework02;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое целое число: ");
        int numberOne = scanner.nextInt();
        System.out.println("Введите второе целое число: ");
        int numberTwo = scanner.nextInt();

        System.out.printf("Сумма двух целых чисел: %s\n", numberOne + numberTwo);
        System.out.printf("Разница двух целых чисел: %s\n", numberOne - numberTwo);
        System.out.printf("Произведение двух целых чисел: %s\n", numberOne * numberTwo);
        System.out.printf("Среднее из двух целых чисел: %s\n", (numberOne + numberTwo)/2);
        System.out.printf("Расстояние двух целых чисел: %s\n", Math.abs(numberOne - numberTwo));
        System.out.printf("Максимальное целое число: %s\n", Math.max(numberOne, numberTwo));
        System.out.printf("Минимальное целое число: %s\n", Math.min(numberOne,numberTwo));




    }
}