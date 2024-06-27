package ch12.sec04;

public class ExitExample {
    public static void main(String[] args) {
        for (int i = 0; 1 < 10; i++) {
            //i값 출력
            System.out.println(i);
            if (i == 5) {
                //JM 프로세스 종료
                System.out.println("프로세스 강제 종료");
                //System.exit() : 프로세스 강제 종료, 0이 코드로 들어가면 정상종료
                System.exit(0);
            }
        }
    }
}
