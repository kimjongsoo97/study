package ch08.sec05;


public class RemoteControlExmaple {
    public static void main(String[] args) {
        RemoteControl rc;
        rc=new Television();//기존 코드
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
    }

}
