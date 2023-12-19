package homework09.car;

import java.util.Objects;

public abstract class Car {

    // поля видимо должны быть private, если надо  делать геттеры  и сеттеры
    // или надо делать сразу класс Care как private?
    private String carBrand; //марка автомобиля
    private String carModel; //модель автомобиля
    private int yearOfRelease; //год выпуска автомобиля (не может быть отрицательное число)
    private int horsePower; //мощность в лошадиных силах
    private int boost; //ускорение
    private int carSuspension; //автомобильная подвеска
    private int theDurability; //долговечность автомобиля


    // пустой конструктор
    public Car() {
    }

    // конструктор с параметрами
    public Car(String carBrand, String carModel, int yearOfRelease, int horsePower, int boost, int carSuspension, int theDurability) {
        this.carBrand = carBrand;
        this.carModel = carModel;
        this.yearOfRelease = yearOfRelease;
        this.horsePower = horsePower;
        this.boost = boost;
        this.carSuspension = carSuspension;
        this.theDurability = theDurability;
    }

        // геттеры и сеттеры для полей
    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getBoost() {
        return boost;
    }

    public void setBoost(int boost) {
        this.boost = boost;
    }

    public int getCarSuspension() {
        return carSuspension;
    }

    public void setCarSuspension(int carSuspension) {
        this.carSuspension = carSuspension;
    }

    public int getTheDurability() {
        return theDurability;
    }

    public void setTheDurability(int theDurability) {
        this.theDurability = theDurability;
    }

    // переопределенный метод toString
    @Override
    public String toString() {
        return "Car{" +
                "carBrand='" + carBrand + '\'' +
                ", carModel='" + carModel + '\'' +
                ", yearOfRelease=" + yearOfRelease +
                ", horsePower=" + horsePower +
                ", boost=" + boost +
                ", carSuspension=" + carSuspension +
                ", theDurability=" + theDurability +
                '}';
    }

    // переопределенные методы equals() и hashcode()


}
