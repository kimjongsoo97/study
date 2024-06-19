package ch06.sec08.exam03;

public class CarExample {
    public static void main(String[] args) {
//       car객체생성
        Car myCar=new Car();
//      리턴값이 없는 setGas()메소드를 호출
        myCar.setGas(5);
//      isLeftGas() 메소드를 호출해서 받은 리턴값이 true일 경우 if 블록실행
//      현재 가스 값이 5이므로 isFull내에서 true를 반환
        if (myCar.isFull()){
            System.out.println("출발합니다");
//           리턴값이 없는 run()매써드 호출
//            gas가 0이 될떄까지 gas를 1씩 줄이면서 가스 상태 출력
            myCar.run();
        }
//        마지막에는 gas가 0인상태
        System.out.println("gas를 주입하세요.");
    }
}
