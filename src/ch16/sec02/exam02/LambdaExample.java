package ch16.sec02.exam02;

public class LambdaExample {
    public static void main(String[] args) {
        //생성자 생성
        Button btnOk=new Button();

        //Ok버튼 객체에 람다식(ClickListener익명 구현 객체) 주입
        btnOk.setClickListener(() -> {
            System.out.println("Ok 버튼을 클릭했습니다.");
        });
        btnOk.click(); //ok버튼 클릭하기

        Button btnCancel=new Button();
        //Cancel 버튼 객체에 람다식(ClickListener 익명 구현 객체)주입
        btnCancel.setClickListener(() -> {
            System.out.println("Cancel 버튼을 클릭했습니다");
        });
        btnCancel.click(); //cancel 버튼 클릭하기
    }
}
