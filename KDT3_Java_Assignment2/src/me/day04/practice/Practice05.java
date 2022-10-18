package me.day04.practice;

public class Practice05 {
    public static void main(String[] args) {
        int a,b,c,count;
        count=0;
        for (a=1;a<=100;a++){
            for (b=1;b<=100;b++){
                for (c=1;c<=100;c++){
                    if ((c*c)==((a*a)+(b*b)) && ((a+b)>c)){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
