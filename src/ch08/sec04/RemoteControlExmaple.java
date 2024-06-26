package ch08.sec04;



public class RemoteControlExmaple {
    public static void main(String[] args) {
        //인터페이스 변수선언
        RemoteControl rc;
        //Television 객체를 생성하고 인터페이스 변수에 대입
        rc=new Television();
       rc.trunOn();
        rc.setVolume(5);
        rc.trunOff();
        //Audio 객체를 생성하고 인터페이스 변수에 대입
        rc=new Audio();
        rc.setVolume(5);
        rc.trunOff();
    }

}
