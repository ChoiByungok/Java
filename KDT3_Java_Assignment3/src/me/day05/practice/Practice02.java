package me.day05.practice;
import java.util.*;

public class Practice02 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int testCase=sc.nextInt(); //전체 테스트케이스 횟수를 지정한다

        for (int i=0;i<testCase;i++){ //테스트 케이스만큼 반복한다

            int repeat = sc.nextInt(); //반복할 문자갯수를 지정한다
            String word = sc.next(); //문자를 입력한다
            for (int j=0;j<word.length();j++){ //문자열 첫번째 요소부터 마지막까지 반복
                for (int k=0;k<repeat;k++){ //반복할 문자 횟수
                    System.out.print(word.charAt(j));//반복 횟수만큼 문자를 반복한 후 반목문을 나가서 다음 요소로 접근해서 반복함
                }
            }
            System.out.println();
        }
    }

}
