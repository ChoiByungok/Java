package ch12;

public class BookShelf extends Shelf implements Queue{
    @Override
    public void enQueue(String title) {
        shelf.add(title);
    }

    @Override
    public String deQueue() {
        return shelf.remove(0);
    }

    @Override
    public void getSize() {
        System.out.println(getCount());
    }
}
