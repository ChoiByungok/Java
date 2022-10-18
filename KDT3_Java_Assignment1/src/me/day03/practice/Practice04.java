package me.day03.practice;
import java.util.Scanner;
public class Practice04
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int pointX,pointY;
        System.out.print("x좌표 입력: ");
        pointX=sc.nextInt();
        System.out.print("y좌표 입력: ");
        pointY=sc.nextInt();

        if (pointX >0 && pointY>0)
        {
            System.out.println("1사분면");
        }
        else if (pointX <0 && pointY>0)
        {
            System.out.println("2사분면");
        }
        else if (pointX<0 && pointY<0)
        {
            System.out.println("3사분면");
        }
        else if (pointX>0 && pointY<0)
        {
            System.out.println("4사분면");
        }
        else if (pointX==0)
        {
            System.out.println("x 축 위에 있음");
        }
        else if (pointY==0)
        {
            System.out.println("y 축 위에 있음");
        }

    }
}
