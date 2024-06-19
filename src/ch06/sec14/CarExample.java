package ch06.sec14;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();
//잘못된 값이 들어갔을경우 set 메소드에서 0으로 처리해준다
//        사용자들은 해당 로직을 알필요가 없으므로 캡슐화해줌

        myCar.setSpeed(-50);
        System.out.println("현재속도:"+myCar.getSpeed());

        myCar.setSpeed(60);
        System.out.println("현재속도:"+myCar.getSpeed());

        if (!myCar.isStop()) {
            myCar.setStop(true);
        }

        System.out.println("현재속도:"+myCar.getSpeed());
    }
}
