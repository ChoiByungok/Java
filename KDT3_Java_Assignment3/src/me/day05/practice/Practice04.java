package me.day05.practice;
import java.util.*;

public class Practice04 {
    public static String reverse(int input){ //리버스 메서드를 직접 구현해 봄
        String  num = ""; //문자열을 비워 놓고
        while (input>0){   //받은 정수의 일의 자리부터 문자열의 첫번째 요소에 집어넣음
            num+=input%10;
            input=input/10;
        }
        return num;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();

        String set1= reverse(num1);
        String set2= reverse(num2);

        num1=Integer.parseInt(set1); //문자열을 다시 정수형으로 변환시킴
        num2=Integer.parseInt(set2);

        System.out.println(num1>num2 ? num1:num2); //삼항 연산자를 이용해 더 큰 값을 출력시킴
    }
}
