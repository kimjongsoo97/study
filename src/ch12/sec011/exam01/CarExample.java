package ch12.sec011.exam01;


public class CarExample {
    public static void main(String[] args) {
        //how1,class static 필드 이용
        Class clazz=Car.class;
        //how2,클래스 문자열이용
        //Class clazz=Class.forName("ch12.sec11.exam01.car);
        //클래스 가져오기3. 인스턴스를 이용
//        Car car=new Car();
//        Class clazz=car.getClass()

        System.out.println("패키지:" + clazz.getPackage());
        System.out.println("클래스 간단 이름:" + clazz.getSimpleName());
        System.out.println("클래스 전체 이름:" + clazz.getName());
    }
}
