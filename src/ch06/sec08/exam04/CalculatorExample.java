package ch06.sec08.exam04;

public class CalculatorExample {
    public static void main(String[] args) {
//        객체생성

        Calculator myCalc = new Calculator();
        //메소드 오버로딩 :메소드 이름은 같지만 파라미터가 다르므로 각각호출
        //          정사각형의 넓이

        double result1=myCalc.areaRectangle(10);
//        직사각형의 넓이
        double result2=myCalc.areaRectangle(10,20);

        System.out.println("정사각형의 넓이:"+result1);
        System.out.println("직사각형의 넓이:"+result2);
    }
}
