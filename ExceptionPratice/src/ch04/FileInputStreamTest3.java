package ch04;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest3 {

    public static void main(String[] args) {

        int i;
        try (FileInputStream fis = new FileInputStream("input2.txt")){

            byte[] bs = new byte[8];

            while ((i = fis.read(bs)) != -1 ){
                for(int j = 0 ; j < i ; j++){
                    System.out.print((char)bs[j]);
                }
                System.out.println();
            }

        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
