package ch07.sec10.exam02;

public class Cat extends Animal {
    @Override
    //추상 메소드 재정의
    public void sound() {
        System.out.println("야옹");
    }
}
