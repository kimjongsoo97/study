package ch01.verify;

public class VariableIntitializationExample {
    public static void main(String[] args) {
//        int value; 변수값이 설정되어있지않으면 자바에서는 오류가남
        int value=10;
//        따라서 value값에 값을 설정하여 오류를해결해야댐
        int result=value +10;
        System.out.println(result);

    }
}
