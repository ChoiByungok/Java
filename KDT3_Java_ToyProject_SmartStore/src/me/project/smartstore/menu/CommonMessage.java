package me.project.smartstore.menu;

public class CommonMessage {

    public static void invalidType(){
        System.out.println("\n다시 시도해주세요\n");
    }
    public static void invalidInput(){
        System.out.println("\n잘못 입력했습니다. 다시 시도해주세요 \n");
    }
    public static void selectGroupPrint(){
        System.out.print("** 'end'를 누르면 뒤로 갈 수 있습니다. **\n" +
                "어떤 그룹을 설정 하시겠습니까 (GENERAL, VIP, VVIP)? ");
    }
    public static void inputParameterPrint(){
        System.out.println("==============================\n" +
                " 1. 최소시간 설정\n" +
                " 2. 최소금액 설정\n" +
                " 3. 뒤로가기\n" +
                "==============================");
    }
    public static void selectNumber(){
        System.out.print("번호선택: ");
    }
    public static void inputMinimumSpentPrint(){
        System.out.print("최소 시간을 입력하세요: ");
    }
    public static void inputMinimumPayPrint(){
        System.out.print("최소 금액을 입력하세요: ");
    }
    public static void nonExistMessage(){
        System.out.println("\n파라미터가 설정되어 있지 않습니다.\n");
    }
    public static void invalidFormat(){
        System.out.println("잘못된 형식입니다 다시 시도해주세요.\n");
    }
}
