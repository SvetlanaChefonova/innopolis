package homeworks.homework02;
import java.util.Scanner;
public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение в градусах Фаренгейта: ");
        double fahrengeitValue = scanner.nextInt();
        double celsiusValue = (fahrengeitValue - 32) * 5 / 9;
        System.out.println(fahrengeitValue +" градусов по Фаренгейту ="+" "+celsiusValue +" " + "по Цельсию.");
    }
}

