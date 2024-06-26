package ch08.sec06;

public interface RemoteControl {
    //상수필드
    int MAX_VOLUME=10;
    int MIN_VOLUME=0;
    //추상 메소드
    void trunOn();
    void trunOff();
    void setVolume(int volume);
    //디폴트 메소드
    default void setMute(boolean mute) {
        if (mute) {
            System.out.println("무음처리합니다");
            setVolume(MAX_VOLUME);
        }else{
            System.out.println("무음 해제 합니다");
        }
    }
    //정적메소드
    static void changeBattery() {
        System.out.println("리모콘 건전지를 교환합니다.");
    }
}
