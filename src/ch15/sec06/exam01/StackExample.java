package ch15.sec06.exam01;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        //Stack컬렉션 생성
        Stack<Coin> coinbox=new Stack<Coin>();
        //동전넣기
        //stack은 한쪽이 막혀있는 박스라고 생각한다
        // 아래쪽부터 차곡차곡쌓인다
        coinbox.push(new Coin(100));
        coinbox.push(new Coin(50));
        coinbox.push(new Coin(500));
        coinbox.push(new Coin(10));
        //동전을 하나씩 꺼내기
        //LIFO기 때문에 마지막에 넣은 10원부터 출력된다.
        //Last In,First,Out
        while (!coinbox.isEmpty()) {
            Coin coin=coinbox.pop();
            System.out.println("꺼내온 동전:" + coin.getValue() + "원");
        }
    }
}
