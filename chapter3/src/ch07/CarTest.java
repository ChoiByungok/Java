package ch07;

import java.util.ArrayList;

public class CarTest {

    public static void main(String[] args) {

        Car aiCar = new AICar();
        Car manualCar = new ManualCar();

        ArrayList<Car> cars = new ArrayList<Car>();

        cars.add(aiCar);
        cars.add(manualCar);

        for (Car car : cars){
            System.out.println("=====================");
            car.run();
            System.out.println("=====================");
        }
    }
}