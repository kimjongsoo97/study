package ch07.sec05.exam02;

public class Member extends Car {
    @Override
    public void speedUp() {
        super.speedUp();
    }
//      컴파일 에러, final 메서드는 오버라이딩을 할 수없음
//    @Override
//    public void stop() {
//        System.out.println("스포츠카를 멈춤");
//        speed=0;
//    }

}
