package ch03;

import java.io.IOException;

import java.io.InputStreamReader;

public class SystemInTest1 {

    public static void main(String[] args) {

        System.out.println("알파벳 여러 개를 쓰고 [Enter]키를 누르세요");

        int i;

        try {
            InputStreamReader irs = new InputStreamReader(System.in); //보조스트림을 감싸면 2바이트인 한글도 읽을 수 있음
           while ((i = irs.read()) != '\n') {
               System.out.print((char) i);
           }
           } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
