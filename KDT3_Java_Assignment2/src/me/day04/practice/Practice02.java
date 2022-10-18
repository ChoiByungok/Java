package me.day04.practice;
import  java.util.Scanner;
public class Practice02 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String word="";
        char input=' ';

        while (true)
        {
            System.out.print("문자를 입력하세요 q를 누르면 종료: ");
            input=sc.next().charAt(0);
            if(input=='q'){
                break;
            }
            word=input+word;
        }
        System.out.println(word);

        }
    }

