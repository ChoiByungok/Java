package ch01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExceptionHandling {

    public static void main(String[] args) {


        try(FileInputStream fis = new FileInputStream("a.txt")){
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("end");
    }
}
