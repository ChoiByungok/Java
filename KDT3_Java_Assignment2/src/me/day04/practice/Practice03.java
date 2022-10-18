package me.day04.practice;

import java.util.Scanner;

public class Practice03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int NUM = 5;
        double sum = 0;
        double avg = 0;
        double input;

        for(int i = 0; i < NUM; i++) {
            System.out.print("성적을 입력하세요: ");
            input= sc.nextInt();
            if (input<0 || input>100){
                System.out.println("유효하지 않은 성적 입력값입니다.");
                i--;
            }
            sum+=input;
        }

        avg = sum / NUM;
        System.out.println("sum = " + sum);
        System.out.println("avg = " + avg);
    }
}

