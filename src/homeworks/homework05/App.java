package homeworks.homework05;


import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i;
        int minCount = 0;
        int maxCount = 10;

        Televisor [] televisors = new Televisor[maxCount];

        for (i = minCount; i < maxCount; i++){
            System.out.println("Введите имя:");
            String name = scanner.nextLine();
            System.out.println("Введите стоимость:");
            int price = scanner.nextInt();
            System.out.println("Введите номер канала:");
            int chanel = scanner.nextInt();
            System.out.println("Введите громкость звука от 0 до 100:");
            int volume = scanner.nextInt();
            System.out.println("Включен ли телевизор? Да или Нет");
            boolean turn = scanner.nextLine() == "Да";

            Televisor newTelevisor = new Televisor(name, price, chanel, volume, false);

            Televisor[televisors.length - 1] = newTelevisor;
            System.out.println(newTelevisor);
        }

    }
}
