package me.java.variables;
import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner sn=new Scanner(System.in);
       //실습1
        /*int sally;
        int notebook;

        System.out.print("노트북의 금액을 입력 하세요: ");
        notebook=sn.nextInt();
        System.out.print("sally가 낸 금액을 입력 하세요: ");
        sally=sn.nextInt();
        notebook*=1.1;

        System.out.print("sally가 받아야 할 잔돈은 "+ (sally-notebook) +"원 입니다");*/

        //실습2
        /*int num1,num2,max,min;
        System.out.print("두 수를 입력하세요: ");
        num1= sn.nextInt();
        num2=sn.nextInt();
        if (num1>num2)
        {
            max=num1;
            min=num2;
        }
        else {
            max =num2;
            min =num1;
        }
        System.out.println("두 수 중 최댓값은 "+ max +"이며 최솟값은" + min +" 입니다.");*/
        //실습3
        /*System.out.print("년도를 입력하세요");
        int input=sn.nextInt();
        if((input%4==0&&input%100!=0)||(input%400==0))
        {
            System.out.println("윤년");
        }
        else
        {
            System.out.println("평년");
        }*/
        //실습4
        System.out.print("정수를 입력하세요: ");
        int num3=sn.nextInt();

        if (num3>0)
        {
            System.out.print("양수");
        }
        else
        {
            System.out.print("음수");
        }
    }
}