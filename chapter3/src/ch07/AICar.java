package ch07;

public class AICar extends Car {

    @Override
    public void drive() {
        System.out.println("자율 주행을 합니다.");
    }

    @Override
    public void stop() {
        System.out.println("알아서 멈춥니다.");
    }
}
