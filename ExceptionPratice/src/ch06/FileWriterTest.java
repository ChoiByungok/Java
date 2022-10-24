package ch06;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

    public static void main(String[] args) {

        try(FileWriter fw = new FileWriter("writer.txt",true)){
            fw.write('A'); //문자 하나 출력
            char[] buf = {'B','C','D','E','F','G'};

            fw.write(buf);
            fw.write("안녕하세요 잘 써지네요");
            fw.write(buf,1,2);
            fw.write(65);
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        System.out.println("출력이 완료되었습니다.");
    }
}
