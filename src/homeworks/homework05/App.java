package homeworks.homework05;


import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i;
        int minCount = 0;
        int maxCount = 10;

        Televisor [] televisors = new Televisor[maxCount];

        for (i = minCount; i < maxCount; i++) {

            System.out.println("Введите имя:");
            String name = scanner.nextLine();
            try {

                System.out.println("Введите стоимость:");
                int price = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Введите номер канала:");
                int chanel = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Введите громкость звука от 0 до 100:");
                int volume = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Включен ли телевизор? True или False");
                boolean turn = scanner.nextBoolean();
                scanner.nextLine();
                System.out.println("");

                Televisor newTelevisor = new Televisor(name, price, chanel, volume, turn);

                televisors[i] = newTelevisor;
                System.out.println(newTelevisor);
                scanner.nextLine();


            } catch (InputMismatchException exception) {
                System.out.printf("Ошибка %s\n", exception);
                System.out.println("Программа завершена");
                scanner.nextLine();

            } finally {
                System.out.printf("Итерация %d завершена\n", i);
                System.out.println("");

                }


        }

            System.out.println("Введите допустимое значение громкости звука, целое число от 50 до 70:");
            int maxVolume = scanner.nextInt();

            for (Televisor televisor : televisors) {
                if (televisor.getVolume() < maxVolume && televisor.turn()) {

                    System.out.println("Включенный телевизор, у которого звук является допустимым: " + televisor.getName());

                      }


                 }



    }
}
