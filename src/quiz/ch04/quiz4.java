package quiz.ch04;

public class quiz4 {
    public static void main(String[] args) {
        int score=(int)(Math.random()*20)+81;
        System.out.println("점수:"+score);

        if (score>=95){
            System.out.println("학점:A+");
        } else if (score>=90) {
            System.out.println("학점:A");
            
        } else if (score>=85) {
            System.out.println("학점:B+");
            
        } else if (score>=80) {
            System.out.println("학점:B");

        }
    }
}
