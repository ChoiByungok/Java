package ch06;

public class DeskTop extends Computer{

    @Override
    public void display() {

        System.out.println("데스크탑의 디스플레이");
    }

    @Override
    public void typing() {

        System.out.println("데스크탑으로 타이핑을 합니다.");
    }
    public void play(){

        System.out.println("게임을 합니다.");
    }
}
