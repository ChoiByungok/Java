package me.day06.practice;
import java.util.*;
import java.lang.*;
public class Practice01 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int[] scores=new int[10];
        int sum=0,max=0,min=9999;
        double average,dispersion = 0,standard_deviation;

        System.out.println("성적을 입력하세요");
        for(int i=0;i<scores.length;i++) {
            System.out.print("학생" + (i + 1) + ":");
            scores[i] = sc.nextInt();
            if(scores[i] > max) {
                max=scores[i];   //입력받은 성적과 최댓값 변수를 비교해가며 최대값이 입력되면 계속 바꿔줌
            }
            if(scores[i] < min){
                min=scores[i];  //입력받은 성적과 최솟값 변수를 비교해가며 최솟값이 입력되면 계속 바꿔줌
            }
            sum+=scores[i]; //평균값을 구하기 위해 원소들의 값을 모두 더함
        }
        average=(double)sum/scores.length; //합계를 배열수 만큼 나눠서 평균값 구함

        for(int i=0;i<scores.length;i++){
            dispersion=dispersion+((scores[i]-average)*(scores[i]-average)); //원소값과 평균값을 비교하여 분산값을 구함
        }
        dispersion=dispersion/scores.length; //원소값과 평균값을 비교하여 분산값을 구함
        standard_deviation=Math.sqrt(dispersion);//분산값에 제곱근을 하여 표준편차를 구함

        System.out.println("최댓값:"+ max +" 최솟값:" + min +" 평균:" + average + " 분산:" + dispersion + " 표준편차:" + standard_deviation);

    }
}
