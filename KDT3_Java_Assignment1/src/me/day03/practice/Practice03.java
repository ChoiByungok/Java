package me.day03.practice;
import java.util.Scanner;
public class Practice03
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int input1,input2;

        System.out.printf("정수를 입력하세요: ");
        input1=sc.nextInt();
        System.out.printf("정수를 입력하세요: ");
        input2=sc.nextInt();
        System.out.printf("연산자를 입력하세요: ");
        char operator = sc.next().charAt(0);
        if(operator=='+')
        {
            System.out.println("연산결과: " + (input1+input2));
        }
        else if(operator=='-')
        {
            System.out.println("연산결과: " + (input1-input2));
        }
        else if (operator=='/')
        {
            System.out.println("연산결과: " + (input1/input2));
        }
        else if (operator=='%')
        {
            System.out.println("연산결과: " + (input1%input2));
        }
        else
        {
            System.out.println("연산자가 유효하지 않습니다.");
        }


    }
}

