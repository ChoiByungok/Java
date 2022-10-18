package me.day06.practice;
import java.util.*;
public class Practice05 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String alphabet= "ABCDEFGHIJKLMNOPQRSTUVWXYZ?";// 글자수가 동일할 경우를 대비해 알파벳 배열의 마지막 문자를 ?로 만듬
        int[] check= new int[26]; //알파벳 길이와 같은 길이의 인트형 배열을 생성함 인덱스 값을 반환하기 위해
        int chk = 1;// 인트형 배열의 값을 증가시키기 위한 변수
        int max=0;  //인트형 배열의 최댓값을 구하기 위한 변수
        int count=0; //최댓값이 2개일 경우 예외처리를 위한 변수
        int pos = 0; //인덱스값을 반환하기 위한 변수

        String str =sc.next(); //입력받은 문자열
        str=str.toUpperCase();//대소문자 구분 안한다고 했고 어차피 출력도 대문자라서 대문자로 변환시킴

        for(int i=0;i<str.length();i++){ //입력받은 문자열의 첫번째부터
            for (int j=0;j<alphabet.length();j++){ //알파벳의 처음부터 마지막까지 비교를 하며
                if(str.charAt(i)==alphabet.charAt(j)){ //같은 문자일시
                    check[j]+=chk;  //알파벳 배열과 같은길이의 인트형 배열의 같은 위치에 인덱스의 숫자를 증가시킴
                }
            }
        }
        for(int i=0;i<check.length;i++){ //인트형배열의 숫자를 처음부터 마지막 까지 비교하며
            if(check[i]>max){  //배열의 값들중에서 max보다 큰 숫자가 나올시
                max=check[i]; //max의 값에 큰 숫자를 넣어준뒤
                pos=i;        //반환하고 싶은 인덱스 값을 저장함
            }
        }
        for(int i=0;i<check.length;i++){
            if(check[pos]==check[i]){  //Mississipi 처럼 가장 많이 쓰인 문자의 갯수가 s 4개 i 4개 처럼같은경우를 대비해
                count++;               //인트형 배열을 순회하며 같은 숫자가 있는 배열이 있을 시 count변수의 값을 증가시킴
            }
        }

        if(count>=2){ //Mississipi의 경우 count가 2이므로 강제적으로 인덱스의 값을 26으로 바꾸게함
            pos=26;   //alphabet 배열의 26번째 인덱스는 ?이므로
        }
        System.out.println(alphabet.charAt(pos));
    }
}
