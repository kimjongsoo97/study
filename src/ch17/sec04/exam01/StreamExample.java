package ch17.sec04.exam01;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        //List 컬렉션 생성
        List<Product> list=new ArrayList<>();
        //5개의 product객체를 생성해서 List에추가
        for (int i = 0; i <= 5; i++) {
            Product product = new Product(i, "상품" + i, "멋진회사", (int) (10000 * Math.random()));
            list.add(product);
        }
        //객체 스트림얻기 stram()으로 list를 Stream으로 만듬
        //list와 stream의 타입은 동일해야한다.
        Stream<Product> stream=list.stream();
        stream.forEach(p->System.out.println(p));
    }
}
