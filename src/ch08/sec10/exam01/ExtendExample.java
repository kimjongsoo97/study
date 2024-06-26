package ch08.sec10.exam01;

public class ExtendExample {
    public static void main(String[] args) {
        //구현 객체 생성
        B b=new B();
        C c=new C();
        D d=new D();
        E e=new E();

        A a;

        a=b;//A<--B(자동타입변환)
        a=c;//A<--C(자동타입변환)
        a=d;//A<--D(자동타입변환)
        a=e;//A<--E자동타입변환)

    }
}
