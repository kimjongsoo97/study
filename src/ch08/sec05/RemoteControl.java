package ch08.sec05;

public interface RemoteControl {
    int MAX_VOLUME=10;
    int MIN_VOLUME=0;

    void trunOn();
    void trunOff();
    void setVolume(int volume);

    default void setMute(boolean mute) {
        if (mute) {
            System.out.println("무음처리합니다");
            setVolume(MAX_VOLUME);
        }else{
            System.out.println("무음 해제 합니다");
        }
    }
}
