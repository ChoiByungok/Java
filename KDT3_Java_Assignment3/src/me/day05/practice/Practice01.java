package me.day05.practice;
import java.util.*;
public class Practice01 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("메시지 입력: ");
        String input= sc.nextLine();
        input=input.toUpperCase(); //입력받은 문자를 일단 모두 대문자로 출력을 한다


        for (int i=0;i<input.length();i++) {
                if(i==0){
                    System.out.print(Character.toLowerCase(input.charAt(0))); //문자열 첫번째 요소는 무조건 소문자로 변환
                }
                else if(input.charAt(i)==' '){
                    System.out.print(" "); //공백을 만나면 일단 공백 먼저 출력하고
                    System.out.print(Character.toLowerCase(input.charAt(i+1))); //공백의 다음 문자를 출력함
                    i++; //그리고 i의 값을 1 증가 시킴 증가 시키지 않으면 hELLO sSALLY 처럼 s가 두번 출력하게됨
                }
                else{
                    System.out.print(input.charAt(i)); //나머지 문자는 그대로 출력하게함
                }
        }
    }
}
