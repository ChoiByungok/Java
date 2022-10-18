package me.day05.practice;

public class Practice05 {
    class Solution {
        boolean solution(String s) {
            boolean answer = true;
            int countP,countY;
            countP=0; // p,P의 갯수를 세는 변수
            countY=0; // y,Y의 갯수를 세는 변수
            for(int i=0;i<s.length();i++){ //문자열 길이 만큼 반복함
                if(s.charAt(i)=='p' || s.charAt(i)=='P'){  //문자열의 처음부터 끝까지 반복하여 p나 P일시 countP가 증가됨
                    countP++;
                }
                if(s.charAt(i)=='y' || s.charAt(i)=='Y'){ //문자열의 처음부터 끝까지 반복하여 y나 Y일시 countY가 증가됨
                    countY++;
                }
            }
            if(countP!=countY){  //최종적으로 p 와 y의 갯수가 같으면 참을 반환함
                answer=false;
            }
            return answer;
        }
    }

}


