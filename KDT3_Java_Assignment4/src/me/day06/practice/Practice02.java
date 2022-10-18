package me.day06.practice;
import java.lang.*;
public class Practice02 {
    public static void main(String[] args) {
        int[] nums= new int[100];
        int max=0,min=101; //최댓값과 최솟값을 저장할 변수 생성

        for (int i=0;i<nums.length;i++){
            nums[i]=(int) (Math.random() * 100)+1; //1~100사이의 난수를 배열에 순서대로 저장함
            if(max<nums[i]){ //배열의 요소를 하나하나 살펴보면서 최댓값을 찾아냄
                max=nums[i];
            }
            if(min>nums[i]){ //배열의 요소를 하나하나 살펴보면서 최솟값을 찾아냄
                min=nums[i];
            }
        }
        System.out.println("최댓값:" + max +" 최솟값:" +min);
    }
}
