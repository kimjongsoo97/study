package ch06.sec08.exam03;

public class Car {
    int gas;
    String model;
    boolean full;
//리턴 값이 없는 메소드로 매개값을 받아서 gas필드값을 변경
    public void setGas(int gas) {
        this.gas = gas;
    }
//    리턴값이 boolean인 메소드로 gas 필드값이 0이면 false를,0이 아니면 true를 리턴
//    boolean리턴하는 함수들은 대부분 is가 붙는다
    boolean isFull() {
        if(gas == 0){
            System.out.println("gas가 없습니다");
            return false;
        }
        System.out.println("gas가 있습니다");
        return true;
    }
//    리턴값이 없는 메소드로 gas필드값이 0이면 return 문으로 메소드를 종료
    void  run(){
    while(true){
        if(gas>0){
            System.out.println("달립니다.(gas잔량:"+gas+")");
        gas-=1;
        }else {
            System.out.println("멈춥니다.(gas잔량:"+gas+")");
        return;// break대신 함수종료를 위한 return 사용
        }
    }
    }
}
