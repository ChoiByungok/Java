package me.day04.practice;
import java.util.Scanner;
public class Practice06 {
    public static void main(String[] args) {

        int i, j;

        for (i = 0; i < 5; i++) {
            for (j = 4; j > -2; j--) {
                if (j >= i) {
                    System.out.print(" ");
                } else
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}
