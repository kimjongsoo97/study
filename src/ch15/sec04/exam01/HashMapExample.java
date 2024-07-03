package ch15.sec04.exam01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        //Map 컬렉션 생성
        Map<String,Integer> map=new HashMap<String,Integer>();
        //객체저장
        map.put("신용권", 85);
        map.put("홍길동", 90);
        map.put("동장군", 80);
        map.put("홍길동", 95);
        //홍길동이란 키 값이 두번 추가됐으므로 아래 값으로 덮어씌여짐
        System.out.println("총 Entry수:"+map.size());
        System.out.println();
        //키로 값 얻기
        String key = "홍길동";
        //get(key)를 사용하면 해당 키에 저장되어있는 value 값을 얻을 수 있다.
        int value = map.get(key);

        System.out.println(key + ":" + value);
        System.out.println();
        //키 Set 컬렉션을 얻고, 반복해서 키와 값을 얻기
        //ketset에는 키값들만 Set형태로 저장되어 있다.
        Set<String> keySet=map.keySet();
        Iterator<String> keyIterator=keySet.iterator();
        while(keyIterator.hasNext()) {
            String k=keyIterator.next();
            //키값을 이용해서 value값을 얻어냄
            Integer v=map.get(k);
            System.out.println(k+":"+v);
        }
        System.out.println();
        //엔트리 Set 컬렉션을 얻고, 반복해서 키와 값을 얻기
        //엔르티에는 key와 value를 모두 담고있다.
        Set<Map.Entry<String,Integer>> entrySet=map.entrySet();
        Iterator<Map.Entry<String,Integer>> entryIterator=entrySet.iterator();
        while(entryIterator.hasNext()) {
            //엔트리 set을 돌면서 다음 엔트리를 가져옴
            Map.Entry<String,Integer> entry=entryIterator.next();
            //getkey:해당 엔트리의키값을 가져오는 메소드
            String k=entry.getKey();
            //getValue:해당 엔트리의 벨류를 가져옴
            Integer v=entry.getValue();
            System.out.println(k+":"+v);
        }
        System.out.println();
        //홍길동이라는 키값을가진  엔트리 삭제
        map.remove("홍길동");

        System.out.println("총 Entry수:"+map.size());
        System.out.println();;

    }
}
