package ch11;

public interface Buy {

    public void buy();

    default void order(){
        System.out.println("buy order");
    }
}
