package ch07.sec07.exam01;

public class PromotionExample {
    public static void main(String[] args) {
        B b=new B();
        C c=new C();
        D d=new D();
        E e=new E();
//      자동타입변환 (상속관게에 있음)
        A a1=b;
        A a2 = c;
        A a3 = d;
        A a4 = e;

        B b1=d;
        C c1=e;


//      컴파일 에러 (상속관계에 있지 않는다)
//        B b3=e;
//        C c2 = d;
    }
}
