package ch08.sec06;


public class RemoteControlExmaple {
    public static void main(String[] args) {
        //인터페이스 변수선언
        RemoteControl rc;
        rc=new Television();//기존코드
       rc.trunOn();
        rc.setVolume(5);
        //디폴트 메소드 호출
        rc.setMute(true);
        rc.setMute(false);
        System.out.println();


        rc=new Audio();//setMute 재정의코드
        rc.trunOn();
        rc.setVolume(5);
        //디폴트 메소드 호출
        rc.setMute(true);
        rc.setMute(false);
        System.out.println();
        //정적 메소드 호풀
        RemoteControl.changeBattery();
    }

}
