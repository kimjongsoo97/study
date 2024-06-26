package ch08.sec11.exam02;

public class DrvierExample {
    public static void main(String[] args) {
        //Drvier 객체 생성
        Driver driver= new Driver();
        //vehicle 구현 객체생성
        Bus bus= new Bus();
        Taxi taxi= new Taxi();

        driver.drive(bus);// 자동 타입변환 : Bus-> Vehicle
        driver.drive(taxi);//자동 타입 변환: Taxi -> Vehicle

    }
}
