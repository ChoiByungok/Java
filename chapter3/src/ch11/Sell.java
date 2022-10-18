package ch11;

public interface Sell {

    public void sell();

    default void order(){
        System.out.println("sell order");
    }
}
