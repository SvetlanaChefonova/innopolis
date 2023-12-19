package homework09.car;

import homework09.car.Car;

import java.util.Arrays;
import java.util.Objects;

/*public class PerfomanceCar extends Car {
    // гоночный автомобиль
    String [] addOns; // создать пустой массив строк
   // int horsePower =  horsePower +  50; // увеличенная мощность двигателя на 50%
   // int carSuspension = carSuspension - 25; // уменьшенная подвеска на 25%\

    public PerfomanceCar(String[] addOns) {
        this.addOns = addOns;
    }

    public String[] getAddOns() {
        return addOns;
    }

    public void setAddOns(String[] addOns) {
        this.addOns = addOns;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PerfomanceCar that = (PerfomanceCar) o;
        return getHorsePower() == that.getHorsePower() && getCarSuspension() == that.getCarSuspension() && Arrays.equals(addOns, that.addOns);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(super.hashCode(), getHorsePower(), getCarSuspension());
        result = 31 * result + Arrays.hashCode(addOns);
        return result;
    }

   /* @Override
    public String toString() {
        return "PerfomanceCar{" +
                "addOns=" + Arrays.toString(addOns) +
                ", horsePower=" + horsePower +
                ", carSuspension=" + carSuspension +
                '}';*/
   // }
//}
