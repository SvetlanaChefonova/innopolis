package homework09.car;

import homework09.car.Car;

import java.util.Objects;

public abstract class ShowCar extends Car {
    int stars = 0; // поле stars  по умолчанию = 0
    //String = // поле для оценки популярности автомобиля "Популярный или не популярный" ?


    public ShowCar(int stars) {
        this.stars = stars;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ShowCar showCar = (ShowCar) o;
        return stars == showCar.stars;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), stars);
    }

    @Override
    public String toString() {
        return "ShowCar{" +
                "stars=" + stars +
                '}';
    }
}
