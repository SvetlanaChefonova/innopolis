
import java.util.Objects;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        String vasyaName = "Вася";
        String petyaName = "Петя";

        String stone = "Камень";
        String scissors = "Ножницы";
        String paper = "Бумага";

        String[] arrayString = new String[3];
        arrayString[0] = stone;
        arrayString[1] = scissors;
        arrayString[2] = paper;
        int vasyaValue;
        int petyaValue;
        do {
            vasyaValue = new Random().nextInt(arrayString.length);
            petyaValue = new Random().nextInt(arrayString.length);
            if (Objects.equals(arrayString[vasyaValue], stone) && Objects.equals(arrayString[petyaValue], scissors)) {
                System.out.println(vasyaName);
            } else if (Objects.equals(arrayString[vasyaValue], scissors) && Objects.equals(arrayString[petyaValue], stone)) {
                System.out.println(petyaName);
            } else if (Objects.equals(arrayString[vasyaValue], paper) && Objects.equals(arrayString[petyaValue], stone)) {
                System.out.println(vasyaName);
            } else if (Objects.equals(arrayString[vasyaValue], stone) && Objects.equals(arrayString[petyaValue], paper)) {
                System.out.println(petyaName);
            } else if (Objects.equals(arrayString[vasyaValue], scissors) && Objects.equals(arrayString[petyaValue], paper)) {
                System.out.println(vasyaName);
            } else if (Objects.equals(arrayString[vasyaValue], paper) && Objects.equals(arrayString[petyaValue], scissors)) {
                System.out.println(petyaName);
            }
        } while ((Objects.equals(arrayString[vasyaValue], arrayString[petyaValue])));

    }

}