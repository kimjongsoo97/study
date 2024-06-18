package ch03.sec07;

public class LogicalOperatorExample {
    public static void main(String[] args) {
        int charCode='A';
//        int charCode='a';
//    int charCode='5';
//      &&:앞과 뒤의 조건이 모두 True인 경우에만 true로 반환
        if((65<=charCode) && (charCode<=90)){
            System.out.println("대문자시군요");
        }
        if((97<=charCode) && (charCode<=122)){
            System.out.println("소문자시군요");
        }
        if((48<=charCode) && (charCode<=57)){
            System.out.println("0~9숫자시군요");
        }
        //---------------------------
        int value=6;
//        int value=7;
//        ||:앞과 뒤의 조건중 하나만 true여도 true반환(or)
//        6이 2의 배수이거나 3의 배수인경우
        if((value%2==0 | (value%3==0))){
            System.out.println("2또는 3의 배수시군요");
        }
        boolean result=(value%2==0||(value%3==0));
//        !:결과값의 반대(result가 true기때문에 !를 붙이면 False가된다.)
        if (!result){
            System.out.println("2또는 3의 배수가 아니시군요");
        }
    }
}
