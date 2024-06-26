package ch08.sec05;

public class Audio implements RemoteControl {

    private int volume;
    private int memoryVolume;

    @Override
    public void trunOn() {

        System.out.println("Audio를 켭니다");
    }

    @Override
    public void trunOff() {
        System.out.println("Audio를 끕니다");

    }

    @Override
    public void setVolume(int volume) {
        if (volume > RemoteControl.MAX_VOLUME) {
            this.volume= RemoteControl.MAX_VOLUME;

        } else if (volume< RemoteControl.MIN_VOLUME) {
            this.volume= RemoteControl.MIN_VOLUME;

        } else {
            this.volume=volume;

        }
        System.out.println("현재 Audio 볼륨:"+volume);
    }
    @Override
    public void setMute(boolean mute) {
        if (mute) {
            this.memoryVolume = this.volume;
            System.out.println("무음처리합니다");
            setVolume(RemoteControl.MIN_VOLUME);
        }else {
            System.out.println("무음해제합니다");
            setVolume(this.memoryVolume);
        }
    }
    }

