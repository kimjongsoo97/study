package ch12.sec03.exam05;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//@data:requireArgsConstructor,getter,setter,equals,hashcode,tostring 메소드 모두포함
//@NoArgsConstructor: 기본 생성자 만들어줌
//@AllArgsConstructor: 모든 필드 포함시키는 생성자 만들어줌

public class Member2 {
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public class Member {
        private String name;
        private int age;
        private String id;
    }
}
