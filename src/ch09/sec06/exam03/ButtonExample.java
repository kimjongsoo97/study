package ch09.sec06.exam03;



public class ButtonExample {
    public static void main(String[] args) {
        //Ok버튼 객체 생성
        Button btnOk = new Button();
        //Ok 버튼 클릭 이벤트를 처리할 ClickListner 구현클래스 (로컬 클래스)
        class OkListener implements Button.ClickListener {
            @Override
            public void onClick() {
                System.out.println("Ok버튼을 클릭 했습니다");
            }
        }
        //Ok 버튼 객체에 ClickListener 구현 객체 주입
        btnOk.setClickListener(new OkListener());
        //Ok 버튼 클릭하기
        btnOk.click();
        //Cancel 버튼 객체 생성
        Button btnCancel=new Button();
        //Cancel 버튼 클릭 이벤트를 처리할 ClickListner 구현 클래스 (로컬클래스)
        class CancelListener implements Button.ClickListener {
            @Override
            public void onClick() {
                System.out.println("cancel 버튼을 클릭했습니다");

            }
        }
        //Cancel 버튼 객체에 ClickListner 구현 객체 주입
        btnCancel.setClickListener(new CancelListener());
        //Cancel 버튼 클릭하기
        btnCancel.click();
    }
}
