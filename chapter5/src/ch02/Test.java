package ch02;

public class Test {
    public static void main(String[] args) {

        MyLinkedList list = new MyLinkedList();
        list.addElement("A");
        list.addElement("B");
        list.addElement("C");
        list.printAll();
        list.insertElement(3,"D");
        list.printAll();
        list.removeElement(0);
        list.printAll();
        list.removeElement(1);
        list.printAll();

        list.insertElement(0,"A-1");
        list.printAll();

        list.removeElement(0);
        list.printAll();

        list.removeAll();
        list.printAll();
        list.addElement("A");
        list.printAll();
        System.out.println(list.getElement(0));
        list.removeAll();
        System.out.println(list.isEmpty());

    }
}
