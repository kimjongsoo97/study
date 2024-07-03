package ch15.sec06.exam02;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        //Queue 컬렉션 생성
        //Queue는 인터페이스기때문에 객체생성불가
        //LinkedList는 Queue의 하위요소기 떄문에 업캐스팅가능
        Queue<Message> messageQueue = new LinkedList<>();
        //메시지 넣기
        messageQueue.offer(new Message("sendMail","홍길동"));
        messageQueue.offer(new Message("sendSMS","신용권"));
        messageQueue.offer(new Message("sendKakaotalk","감자바"));
        //메시지를 하나씩 꺼내어 처리
        //큐가 비어있지 않을때까지 메시지를 하나씩 꺼내어 처리
        while (!messageQueue.isEmpty()) {
            //poll:큐에서 요소하나꺼내기
            //FIFO기 때문에 가장먼저 넣은 홍길동이 꺼내진다
            //First in Firstout
            Message message = messageQueue.poll();
            switch (message.command) {
                case "sendMail":
                    //message.to는 매번 요소를 돌때마다 달라진다
                System.out.println(message.to+"님에게 메일을 보냅니다");
                break;
                case "sendSMS":
                System.out.println(message.to+"님에게 SMS을 보냅니다");
                break;
                case "sendKakaotalk":
                System.out.println(message.to+"님에게 카카오톡을 보냅니다");
            }
        }
    }
}
