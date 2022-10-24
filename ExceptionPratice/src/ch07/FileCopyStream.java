package ch07;

import java.io.*;

public class FileCopyStream {

    public static void main(String[] args) {

        long millisecond = 0;

        try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream("a.zip")) ;
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copy1.zip")) ){

            millisecond = System.currentTimeMillis();

            int i;
            while ((i = bis.read()) != -1){
                bos.write(i);
            }

            millisecond = System.currentTimeMillis() - millisecond;

        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        System.out.println(millisecond + "만큼 소요되었습니다.");
    }
}
