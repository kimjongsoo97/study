package ch13.sec01;

public class GenericExample {
    public static void main(String[] args) {
        //Box<String> box1=new Box<String>();
        ///앞에 타입이 들어가면 뒤에<>안에 탑인은 생략가능 (타입추론)
        Box<String> box1=new Box<>(); //Box 생성시 타입 파라미터 대신 String으로 대체
        box1.content = "안녕하세요";
        String str=box1.content;
        System.out.println(str);

        //Box<Integer> box2=new Box<Integer>();
        Box<Integer> box2=new Box<>(); //Box 생성시 타입파라미터 대신 Integer로 대체
        box2.content=100;
        int value=box2.content;
        System.out.println(value);
    }
}
