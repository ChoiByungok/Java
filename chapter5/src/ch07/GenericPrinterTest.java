package ch07;

import ch06.GenericPrinter;
import ch06.Plastic;
import ch06.Powder;

public class GenericPrinterTest {
    public static void main(String[] args) {

        ch06.Plastic plastic = new ch06.Plastic();
        ch06.Powder powder = new Powder();
        ch06.GenericPrinter<ch06.Plastic> powderprinter = new GenericPrinter<>();
        powderprinter.setMaterial(plastic);

        Plastic p = powderprinter.getMaterial();
        System.out.println(powderprinter.toString());
    }
}
