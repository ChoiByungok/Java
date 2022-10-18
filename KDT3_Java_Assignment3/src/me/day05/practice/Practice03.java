package me.day05.practice;
import java.util.*;
public class Practice03 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String input=sc.nextLine();
        int count=0;

        for (int i=0;i<input.length();i++){
            if (input.charAt(i)==' '){
                count++;         //반복문을 돌면서 공백의 숫자를 셈
            }
        }
        if (input.charAt(0)==' ' && input.charAt(input.length()-1)==' '){  //문자열의 맨앞이나 맨 뒤가 둘다 공백일시 -1함
            count--;                                                       //문자열의 앞이나 뒤 중 하나만 공백일시
        }                                                                  //공백의 숫자나 단어의 갯수나 같으니 따로 건드리지 않음
        if (input.charAt(0)!=' ' && input.charAt(input.length()-1)!=' '){  //문자열의 맨 앞이나 맨 뒤가 둘다 공백이 아닐 시 +1함
            count++;
        }
        System.out.println(count);
    }
}

