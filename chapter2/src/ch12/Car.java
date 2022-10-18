package ch12;

public class Car {

    private static int serialNum = 10000;
    private int carNum;

    public Car(){

        serialNum++;
        this.carNum = serialNum;
    }

    public static int getSerialNum() {
        return serialNum;
    }

    public int getCarNum() {
        return carNum;
    }
}
