package ch07.sec03.exam01;

public class SmartPhone extends Phone{
    //자식 생성자 선언
    public SmartPhone(String model, String color) {
       //super 키워드로 부모의 기본 생성자를 호출해줌
        //해당 코드는 없어도 기본적을 동작함
        super();
        this.model=model;
        this.color=color;
        //메소드 선언
        System.out.println("SmartPhone(String model,String color)생성자 실행됨");
    }
}
