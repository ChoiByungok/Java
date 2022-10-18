package ch04;

public class ClassTest {

    public static void main(String[] args) throws ClassNotFoundException , InstantiationException , IllegalAccessException{

        Class c1 = Class.forName("ch04.Car");

        Car car = (Car)c1.newInstance();

        car.setCarName("페라리");
        System.out.println(car);

        Class c2 = car.getClass();
        Car c = (Car)c2.newInstance();
        System.out.println(c);

    }
}
