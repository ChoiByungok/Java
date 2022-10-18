package ch07;

public class ManualCar extends Car {
    @Override
    public void drive() {
        System.out.println("사람이 직접 운전합니다.");
    }

    @Override
    public void stop() {
        System.out.println("브레이크를 밟아 멈춥니다.");
    }
}
