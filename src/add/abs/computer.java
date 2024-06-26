package add.abs;

public abstract class computer {
    abstract  void show();
    abstract  void input();

    public void trunOn(){
        System.out.println("전원 켜기");
    };public void trunOff(){
        System.out.println("전원 끄기");
    };
}
