package homework03;

public class Televisor {
    private String name;
    private int price;

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

    public String toString() {
        return "Televisor с параметрами:\n" +
                this.name + " - Имя;\n" +
                this.price + " - Стоимость;\n";
    }
}
