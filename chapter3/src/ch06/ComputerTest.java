package ch06;

public class ComputerTest {

    public static void main(String[] args) {

        Computer myNoteBook = new MyNoteBook();
        DeskTop deskTop = new DeskTop();

        deskTop.display();
        deskTop.play();

    }
}
