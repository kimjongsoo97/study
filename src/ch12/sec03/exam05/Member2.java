package ch12.sec03.exam05;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
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
