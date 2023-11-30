package homeworks.homework05;

import java.util.Objects;

public class Televisor {
    private String name;
    private int price;
    public int getChanel() {
        return chanel;
    }
    public void setChanel(int chanel) {
        this.chanel = chanel;
    }
    private int chanel;
    public int getVolume() {
        return this.volume;
    }
    public void setVolume(int volume) {
        if (volume <= 0 || volume >= 100){
            throw new RuntimeException("Введенное значение должно быть >= 0 и <= 100");
        }
        this.volume = volume;
    }
    private int volume;
    private boolean turn;
    public Televisor(String name) {
        this.name = name;
    }
    public Televisor(String name, int price, int chanel, int volume, boolean turn) {
        this.name = name;
        this.price = price;
        this.chanel = chanel;
        this.volume = volume;
        this.turn = turn;
    }
    public Televisor(
            String name,
            int price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return "Televisor{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", chanel=" + chanel +
                ", volume=" + volume +
                ", turn=" + turn +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Televisor televisor = (Televisor) o;
        return getChanel() == televisor.getChanel();
    }
    @Override
    public int hashCode() {
        return Objects.hash(getChanel());
    }
}