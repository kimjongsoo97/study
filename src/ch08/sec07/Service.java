package ch08.sec07;

public interface Service {
    default void defaultMethod1() {
        System.out.println("defalutMethods1 종속코드");
        defaultCommon();
    }
    default void defaultMethod2() {
        System.out.println("defaultMethods2 종속코드");
        defaultCommon();
    }
    //private 메소드
    private void defaultCommon() {
        System.out.println("defaultmethod 중복코드 A");
        System.out.println("defaultmethod 중복코드 B");
    }
    //정적메소드
    static void staticMethod1(){
        System.out.println("staticMethod1 종속코드");
        staticCommon();
    }

    static void staticMethod2() {
        System.out.println("staticMethods2 종속코드");
        staticCommon();
    }
    //private 정적 메소드
    static void staticCommon() {
        System.out.println("staticMethod 중복코드C");
        System.out.println("staticMethod 중복코드D");
    }
}
