package ch04;

import java.util.Objects;

public class Car {
    private String carName;
    private int speed;

    public Car() {
    }

    public Car(String carName, int speed) {
        this.carName = carName;
        this.speed = speed;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return speed == car.speed && carName.equals(car.carName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carName, speed);
    }

    @Override
    public String toString() {
        return "Car{" +
                "carName='" + carName + '\'' +
                ", speed=" + speed +
                '}';
    }
}
