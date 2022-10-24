package ch07;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {

    public static void main(String[] args) {
        int i;
        try(InputStreamReader isr = new InputStreamReader(new FileInputStream("reader.txt"))){
            while ((i = isr.read()) != -1){
                System.out.print((char)i);
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        System.out.println("end");
    }
}
