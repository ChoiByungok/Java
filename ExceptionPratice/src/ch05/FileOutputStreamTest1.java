package ch05;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest1{

    public static void main(String[] args) {
                                                            /*옵션으로 true를 주면 overwrite 되지않고 뒤에 계속 이어서 쓸 수 있음*/
        try(FileOutputStream fos = new FileOutputStream("output.txt",true)){

            for (int i = 0 ;i < 100; i++){
                fos.write(i);
            }

        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        System.out.println("end");
    }
}
