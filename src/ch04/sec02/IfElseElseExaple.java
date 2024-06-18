package ch04.sec02;

public class IfElseElseExaple {
    public static void main(String[] args) {
        int score=75;
//        if-else문은 위의 if 문이 true일경우 아래 조건을 체크하지 않는다
        if (score>=90){
            System.out.println("점수가 90보다 큽니다");
            System.out.println("등급은 A입니다");
        }else if (score>=80){
            System.out.println("점수가 80~90사이입니다");
            System.out.println("등급은 B입니다");
        }else if (score>=70){
            System.out.println("점수가 70~79사이입니다");
            System.out.println("등급은 C입니다");
        }
        else if (score<=70){
            System.out.println("점수가 70미만입니다");
            System.out.println("등급은 D입니다");
        }
    }
}
