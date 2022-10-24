package ch01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {
                                                                  /*예외를 호출한곳에서 처리하도록 던짐*/
    public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {

        FileInputStream fis = new FileInputStream(fileName);
        Class c = Class.forName(className);
        return c;
    }

    public static void main(String[] args) {

        ThrowsException test = new ThrowsException();
        try {
            test.loadClass("a.txt","java.lang.String");  //예외는 메서드에서 나오지만 처리는 호출한곳에서 처리함
        } catch (FileNotFoundException e) {  //한번에 두가지 예외를 처리함
            System.out.println(e);
        } catch (ClassNotFoundException e) { //한번에 두가지 예외를 처리함
            System.out.println(e);
        }
        System.out.println("end");
    }
}
