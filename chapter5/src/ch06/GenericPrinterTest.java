package ch06;

public class GenericPrinterTest {
    public static void main(String[] args) {

        Plastic plastic = new Plastic();
        Powder powder = new Powder();

        GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();
        powderPrinter.setMaterial(powder);

        GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<>();
        plasticPrinter.setMaterial(plastic);

        System.out.println(powderPrinter);
        System.out.println(plasticPrinter);


    }
}
