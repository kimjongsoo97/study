package ch18.sec03.exam02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReamExample {
    public static void main(String[] args) {
        try (InputStream is = new FileInputStream("C:/Temp/test2.db")) {
           byte[] data=new byte[100];
            while (true) {
                int num = is.read(data);//최대 100 byte 읽기
                if (num==-1)break; //파일 끝 도달

                for (int i=0;i<num;i++) {
                    System.out.print(data[i]);
                }
            }
        }catch(FileNotFoundException e){
            //파일을 제대로 찾지 못했을 경우 예외처리
            e.printStackTrace();
        }catch(IOException e){
            // 입출력이 제대로 동작하지 않았을 경우 예외처리
            e.printStackTrace();
        }
    }
}
