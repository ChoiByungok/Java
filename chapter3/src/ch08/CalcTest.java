package ch08;

public class CalcTest {

    public static void main(String[] args) {

        Calc calculator = new CompleteCalc();
        System.out.println(calculator.add(3,4));
        System.out.println(calculator.divide(3,0));
    }
}
