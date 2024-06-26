package quiz.oo2;

public class MemberService {
    public static void main(String[] args) {
        MemberService memberService = new MemberService();
        boolean result = memberService.login("hong",12345);
        Member user1=new Member("홍길동","hong");

        if (result){
            if (memberService.login("hong",12345)==true){
                System.out.println("로그인 되었습니다.");
                memberService.logout("hong");
            }

        }else{
            System.out.println("id 또는 password가 올바르지 않습니다");
        }




    }

    private boolean login(String id, int age) {
        return false;
    }

    private void logout(String id) {
    }

}
