package me.day04.practice;
import java.util.Scanner;
public class Practice04 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};

        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr.length;j++){
                if(arr[j]>arr[i])
                System.out.println("("+arr[i]+","+arr[j]+")");
            }
        }
    }
}
