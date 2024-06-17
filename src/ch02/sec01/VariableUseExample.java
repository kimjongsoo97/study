package ch02.sec01;

public class VariableUseExample {
    public static void main(String[] args) {
        int hour=3;
        int minute=5;
        System.out.println(
                hour+"시간"+minute +"분"
//                문자와 변수를 이어줄 때는 +로 이어운다
//                문자열은 ""로 감싸주고, 변수는 변수이름만작성
        );
        int totalMinute=(hour*60)+minute;
        System.out.println("총" + totalMinute + "분");
    }
}
