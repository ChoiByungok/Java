package ch06;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {

    public static void main(String[] args) {

        /*FileInputStream 은 바이트 단위로 읽기 때문에 reader.txt에 있는 한글 파일을 읽을 수 없음
        * 한글은 2바이트 이기 때문에 그리하여 FileReader 스트림을 이용하면 한글도 읽기 가능*/
        try(FileReader fr = new FileReader("reader.txt")){
            int i;
            while ((i = fr.read()) != -1){
                System.out.print((char)i);
            }

        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
