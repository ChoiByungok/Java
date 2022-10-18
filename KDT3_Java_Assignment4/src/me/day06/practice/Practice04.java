package me.day06.practice;
import java.util.*;
public class Practice04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt(); //테스트 케이스 입력변수
        int count =1; // 'O'의 갯수 누적및 체크
        int sum;      // 점수 누적시키는 변수

        for (int i=0;i<num;i++){
            String string = sc.next(); //문자열 입력받는 변수
            sum=0; count=1; //내부 반목문이 종료되면 다시 변수를 초기화 시켜야함
            for (int j=0;j<string.length();j++){
                if(string.charAt(j)=='O'){  //문자열을 훝어보면서 'O' 일시
                    sum+=count;    //점수를 sum 변수에 누적시킴
                    count++;       //연속해서 'O'를 받을시 점수가 1점씩 올라가니 증감연산을 시켜줌
                }
                else if(string.charAt(j)=='X'){
                    count=1; //'X'를 만날시엔 점수를 누적시킬 필요도 없고 점수도 다시1점으로 내려가기 때문에 1로 초기화 함
                }
            }
            System.out.println(sum); //외부 반목문이 한번씩 끝날때마다 결과를 출력시켜줌
        }

    }
}
