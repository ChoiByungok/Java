package ch10;

public class CalcTest {

    public static void main(String[] args) {

       Calc calc = new CompleteCalc();
       calc.description();
       int[] arr = {1,3};
       Calc.total(arr);

    }
}
