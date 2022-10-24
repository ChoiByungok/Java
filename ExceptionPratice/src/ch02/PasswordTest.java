package ch02;

import java.util.Scanner;

public class PasswordTest {

    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) throws PasswordException{

        if(password == null){
            throw  new PasswordException("비밀번호는 null 일 수 없습니다.");
        }else if(password.length() < 5){
            throw  new PasswordException("비밀번호는 5자 이상이어야 합니다.");
        } else if (password.matches("[a-zA-Z]+")) {
            throw new PasswordException("비밀번호는 숫자나 특수문자를 포함해야 합니다.");
        }

        this.password = password;
        System.out.println("비밀번호가 성공적으로 입력 되었습니다.");
    }

    public static void main(String[] args) {

        PasswordTest passwordTest = new PasswordTest();

        Scanner sc = new Scanner(System.in);
        while (true){
            try {
                System.out.print("비밀번호를 입력하세요:");
                passwordTest.setPassword(sc.nextLine());
            }catch (PasswordException e){
                System.out.println(e.getMessage());
            }
            if(!(passwordTest.getPassword() == null)){
                break;
            }
        }
        System.out.println("귀하의 비밀 번호는 " + passwordTest.getPassword() + "입니다.");
    }
}
