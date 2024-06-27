package ch12.sec012;

import java.lang.reflect.Method;

public class printLine {
    public static void main(String[] args) throws Exception {
        //서비스 클래스의 메소드를 배열로 가져옴
        Method[] declaredMethods = Service.class.getDeclaredMethods();
        for (Method method : declaredMethods) {
            //PrintAnnotation 가져오기
            PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);
        //설정정보를 이용해서 메소드 위에 선출력
            printLine(printAnnotation);
          //실제 해당하는 메소드를 호출
            method.invoke(new Service());
            //설정정보를 이용해서 메소드 밑에 선출력
            printLine(printAnnotation);}
    }
            public static void printLine(PrintAnnotation printAnnotation){
                if (printAnnotation != null) {
                    int number=printAnnotation.number();
                    for (int i=0; i<number;i++){
                        String value = printAnnotation.value();
                        System.out.print(value);
                    }
                    System.out.println();
                }

            }


}
