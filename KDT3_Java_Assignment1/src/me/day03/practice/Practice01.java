package me.day03.practice;
import java.util.Scanner;
public class Practice01
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int count=0;
        double input,avg=0;
        String[] subject = {"국어","수학","영어"};

        while (true)
        {
            System.out.print(subject[count++] + "성적입력: ");
            input= sc.nextDouble();
            if(input<0 || input >100)
            {
                System.out.println("성적이 유효하지 않습니다\n다시입력해주세요");
                count--;
                continue;
            }
            avg+=input;
            if(count==3)
            {
                break;
            }
        }

        if((avg/3)>=70)
        {
            System.out.println("평균" + (avg/3) + "점 합격");
        }
        else
        {
            System.out.println("평균" + (avg/3) + "점 불합격");
        }
    }

}



