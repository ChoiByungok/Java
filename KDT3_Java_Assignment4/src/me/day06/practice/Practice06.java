package me.day06.practice;
import java.util.*;
public class Practice06 {

    public static String[] solution(int n, int[] arr1, int[] arr2){
        String[] answer =new String[n];
        for(int i=0;i<n;i++){
            arr1[i]=arr1[i] | arr2[i];  //둘중에 하나라도 벽이면 #을 출력해야 하기 때문에 or연산을 통해 미리 원하는 배열을 만들어 버립니다.
        }
        for (int i=0;i<n;i++){
            answer[i]=intToBinary(n,arr1[i]);  //밑에 만들어 놓은 함수에 or연산이 끝난 배열을 매개변수로 보냅니다.
            System.out.println(answer[i]);
        }
        return answer;
    }
    public static String intToBinary(int num,int value){

        int N=(num-1);    //시프트 연산을 위해 -1을 해줌
        String binary="";
        String binary2="";  //문자열 뒤집기 위한 빈 문자열
        int copy=value;
        while(copy>0){
            if(copy%2==1) {            //2진법으로 변환하면서 동시에 1은# 0은 공백으로 바꿔줬습니다.
                binary = binary + "#";
            }
            else {
                binary=binary+" ";
            }
                copy = copy / 2;
        }
        while(N>=1){                //우리가 원하는건 예를들어 길이가5인 문자열인데
            if(value>=(1<<N)){      //9라는 숫자가 들어왔을때 0001 4자리 밖에 안넣어저서 뒤에 0을 넣기 위해 넣은 코드입니다.
                break;              //시프트 연산을 통해 16 8 4 2 1 순으로 비교해가면서 그 숫자보다 작을시 0을 추가 합니다.
            }                       //이 코드또한 0을 공백으로 치환 해줬습니다.
            else{
                binary=binary+" ";
                N--;
            }
        }
        for(int i=binary.length()-1;i>=0;i--){  //위의 연산을 수행하면 우리가 원하는 문자열을 뒤집은 문자열이라
            binary2=binary2+binary.charAt(i);   //아까 만들어 놓은 빈 문자열 binary2에 역순으로 저장하여
        }                                       //원하는 문자열로 만들어줍니다.
        return binary2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};
        solution(n,arr1,arr2);

    }
}
