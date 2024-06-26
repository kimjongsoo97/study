package ch11.sec02.exam01;

public class ExecptionHandlingExample2 {
    public static void printLength(String data) {
        try{//예외가 발생할수 있는 코드 작성하는 부분
            int result=data.length();//data가 null일 경우 nullpointer실행
            System.out.println("문자 수 :" + result);

        }catch (NullPointerException e) {//해당 예외가 발생했을때 처리
            System.out.println(e.getMessage());//1번
            //System.out.println(e.toString);2번
            //e,printStackTrace();//3 이걸 개발할때 제일많이씀 예외가 어느부분에서 실행됫는지 알려줌


    }finally{//에외가 발생하든안하든 무조건실행
        System.out.println("[마무리실행");
    }
    }

    public static void main(String[] args) {
        System.out.println("[프로그램 시작]\n");
        printLength("ThisIsJava");
        printLength(null);
        System.out.println("[프로그램 종료]");
    }
}


