package me.day03.practice;
import  java.util.Scanner;
public class Practice02
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        char diff=('a'-'A');
        System.out.printf("알파벳 하나 입력: ");
        char word = sc.next().charAt(0);
        if(word >='a' && word <='z')
        {
            System.out.println("대문자로 변환 되었습니다: " + (char)(word-diff));
        }
        else if (word >= 'A' && word <= 'Z')
        {
            System.out.println("소문자로 변환 되었습니다: " + (char)(word+diff));
        }
        else
        {
            System.out.println("영문자가 유효하지 않습니다.");
        }


    }

}
