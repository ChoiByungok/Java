package ch12;

public class CarFactory {

    private static CarFactory carfactory = new CarFactory();

    private CarFactory(){}

    public static CarFactory getInstance(){

        if(carfactory == null){
            carfactory = new CarFactory();
        }
        return carfactory;
    }

    public Car createCar(){
        Car car = new Car();
        return car;
    }
}
