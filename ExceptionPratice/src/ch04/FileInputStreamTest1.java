package ch04;

import java.io.FileInputStream;

import java.io.IOException;

public class FileInputStreamTest1 {

    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
             fis = new FileInputStream("input.txt");
            System.out.println((char) fis.read());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }finally {
            try {
                fis.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }catch (Exception e2){
                System.out.println(e2.getMessage());
            }
        }
        System.out.println("강제 종료 아니다.");
    }
}
