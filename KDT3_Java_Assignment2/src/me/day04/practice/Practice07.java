package me.day04.practice;
import java.util.Scanner;
public class Practice07 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choice;
        System.out.print("현금을 얼마나 가지고 있니? ");
        int money=sc.nextInt();
        int[] menu={2500,3000,4000,5000};
        if(money<2500){
            System.out.println("돈이 부족하여 김밥천국 입장 불가능합니다.");
            return;
        }
        System.out.println("메뉴를 선택해주세요.");
        System.out.println("=====================");
        System.out.println("1. 김밥   (2500)");
        System.out.println("2. 라면   (2500)");
        System.out.println("3. 떡볶이  (4000)");
        System.out.println("4. 돈까쓰  (5000)");
        System.out.println("5. 종료");
        System.out.println("=====================");
        while (true){
            if(money<menu[0]){
                System.out.println("잔돈은 "+money+ "원입니다.\n더이상 선택할 수 없습니다. 프로그램 종료.\n지금까지 선택하신 식사 주문이 완료되었습니다.");
                break;
            }
            System.out.print("메뉴 주문번호: ");
            choice=sc.nextInt();
            if(choice<1 || choice>5){
                System.out.println("메뉴 선택 오류. 1 ~ 5번 사이의 메뉴를 선택해주세요.");
                continue;
            }
            if(choice==5){
                System.out.println("프로그램 종료\n지금까지 선택하신 식사 주문이 완료되었습니다.");
                break;
            }
            switch (choice){
                case 1:
                        money-=menu[choice-1];
                        System.out.println("김밥 선택하셨습니다.");
                        break;
                case 2:
                    if(money>=menu[choice-1]) {
                        money -= menu[choice - 1];
                        System.out.println("라면 선택하셨습니다.");
                        break;
                    }
                    else {
                        System.out.println("돈이 부족하여 메뉴를 선택할 수 없습니다.");
                        continue;
                    }
                case 3:
                    if(money>=menu[choice-1]) {
                        money -= menu[choice - 1];
                        System.out.println("떡볶이 선택하셨습니다.");
                        break;
                    }
                    else {
                        System.out.println("돈이 부족하여 메뉴를 선택할 수 없습니다.");
                        continue;
                    }
                case 4:
                    if(money>=menu[choice-1]) {
                        money -= menu[choice - 1];
                        System.out.println("돈까쓰 선택하셨습니다.");
                        break;
                    }
                    else {
                        System.out.println("돈이 부족하여 메뉴를 선택할 수 없습니다.");
                        continue;
                    }
            }
        }
    }
}
