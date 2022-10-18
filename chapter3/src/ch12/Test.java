package ch12;

public class Test {

    public static void main(String[] args) {

        Queue bookQueue = new BookShelf();
        bookQueue.enQueue("1");
        bookQueue.enQueue("2");
        bookQueue.enQueue("3");
        bookQueue.enQueue("4");
        bookQueue.enQueue("5");

        bookQueue.getSize();

        System.out.println(bookQueue.deQueue());
        System.out.println(bookQueue.deQueue());
        System.out.println(bookQueue.deQueue());
        System.out.println(bookQueue.deQueue());
        System.out.println(bookQueue.deQueue());
        System.out.println(bookQueue.deQueue());

        bookQueue.getSize();

    }
}
