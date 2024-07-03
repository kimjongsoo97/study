package ch13.sec02.exam03;

public class GenericExample {
    public static void main(String[] args) {
        //Box를 사용할대 타입을 명시하지 않았기 때문에 object로 간주한다
        Box box1=new Box();
        //해당객체의 타입은 String으로 간주한다.
        box1.content = "100";

        Box box2=new Box();
        box2.content = "100";

        Box box3=new Box();
        box3.content = "100";
//해당 코드에서 box1이 해당 객체가 되고 box2는 other가 된다
        //compare 사용시 box1의 content와 box2의 content가 같은지 비교
        boolean result = box1.compare(box2);
        System.out.println("result = " + result);
        boolean result2 = box1.compare(box3);
        System.out.println("result2 = " + result2);
    }
}
