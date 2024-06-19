package quiz.ch04;

import java.util.Scanner;

public class l3quiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run=true;
        int i =0;
        while(run){
            System.out.println("---------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("----------------------");
            System.out.println("선택");
            String strNum = scanner.nextLine();
            int num= Integer.parseInt(strNum);
            if(num==1){
                System.out.println("예금액을 입력하세요");
                System.out.println("예금액>"+strNum);
                int depositAmount=Integer.parseInt(scanner.nextLine());
                i+=depositAmount;
                System.out.println("현재잔고:"+i);


            } else if (num==2){ int withdraw=Integer.parseInt(scanner.nextLine());
                {if (withdraw>=i){
                System.out.println("출금액부족");

            }else {i-=withdraw;
                    System.out.println("현재잔고:"+i);

            }
            }

            } else if (num==3) {

                System.out.println("잔고>"+i);

            }else if(strNum.equals("4")){
                run=false;System.out.println("프로그램 종료");
            }
        }


    }
}
