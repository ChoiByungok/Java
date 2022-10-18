package me.day05.practice;
import java.util.*;
public class Practice07 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        String input=sc.nextLine(); //문자를 입력받음
        input=input.toLowerCase(); //모든 문자를 소문자로 변환

        String match = "[^a-z0-9]"; //정규표현식을 이용해 영숫자를 제외한 모든문자 제거
        input=input.replaceAll(match,""); //정규표현식을 이용해 영숫자를 제외한 모든문자 제거
        String output=""; //뒤집을 문자열을 저장할 빈 문자열

        for (int i=0;i<input.length();i++){
                output+=input.charAt(input.length()-1-i); //반복문을 통해 마지막 문자부터 빈문자열에 차례대로 집어넣어서
        }                                                 //문자열을 뒤집음

        boolean answer=true;

        for (int i=0;i<input.length();i++){   //원래 문자열이나 뒤집은 문자열이나 길이는 같기 때문에 아무문자열 길이로 반복해도 상관없음
            if (input.charAt(i)!=output.charAt(i)){ //문자열 첫번째 요소부터 비교해서 하나라도 다르면 false 반환하도록 함
                answer=false;
            }
        }

        System.out.println(answer);
    }

}
