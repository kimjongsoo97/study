package ch18.sec07.exam02;

import java.io.*;
import java.io.FileReader;

public class ReadLineExample {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("C:/fullstack/04_Java/study/src/ch18/sec07/exam02/ReadLineExample.java"));
        int lineNo=1;
        while (true) {
            //저장되어 있는 데이터를 한줄씩 읽어옴
            String str=br.readLine();
            //더이상 들어올 데이터가 없으면 null이 들어
            if(str==null)break;
            //코드의 줄번호와 함께 전체 코드 출력함
            System.out.println(lineNo+" \t"+str);
            lineNo++;
        }
        br.close();

    }
}
