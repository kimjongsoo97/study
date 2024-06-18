package ch02.sec13;
import java.util.Scanner;
public class ScannerExample {
    public static void main(String[] args) throws Exception{
        //scanner 클래스를 이용해서 새로운 스캐너 객체 생성
        Scanner scanner = new Scanner(System.in);
//다음칸에 입력받기 위해 print로 입력문 출력
        System.out.print("x 값 입력:");
        //스캐너로 한줄을 입력받아서 strx에저장
        String strX=scanner.nextLine();
      //받아온 strX을 int 로 형변환(String->int)
        int x=Integer.parseInt(strX);

        System.out.println("y 값 입력:");
//        스캐너로 한줄을 입력받아서 stry에 저장
        String strY=scanner.nextLine();
        int y=Integer.parseInt(strY);
//        int stry=scanner.nextInt 를 이용하면 한번에 int를 받아올수있다

        int result=x+y;
        System.out.println("x+y:"+result);
        System.out.println();
//      무한루프
        while(true){
            System.out.print("입력 문자열:");
            String data = scanner.nextLine();
//           문자열의 값을 비교할때 equals사용
            if (data.equals("q")){
//                무한루프 문은 보통 break와 함께 쓰인다(반복종료)
                break;
            }
            System.out.println("출력 문자열: "+data);
            System.out.println();
        }
        System.out.println("종료");
    }
}
