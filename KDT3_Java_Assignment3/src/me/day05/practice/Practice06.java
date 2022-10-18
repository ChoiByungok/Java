package me.day05.practice;
import java.util.*;
public class Practice06 {
    public static void main(String[] args) {
        String phone_number ="027778888";
        String answer="";
        for (int i=0;i<phone_number.length();i++){
            if (i<phone_number.length()-4){  //문자열의 마지막에서 4번째 수 까지 *로 집어넣음
                answer+="*";
            }
            else {
                answer += phone_number.charAt(i); //마지막 4자리는 그대로 집어넣음
            }
        }
        System.out.println(answer);


    }
}
