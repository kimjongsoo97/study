package ch17.sec07.exam02;

import java.util.ArrayList;
import java.util.List;


public class SortingExample {
    public static void main(String[] args) {
        List<Student>studentList=new ArrayList<>();
        studentList.add(new Student("홍길동", 30));
        studentList.add(new Student("신용권", 10));
        studentList.add(new Student("유미선", 20));
        //점수를 기준으로 오름차순으로 정렬한 새스트림 얻기
        studentList.stream()
                //Student가 comparable을 구현하지 않았으므로 직접적인 compare함수를 넣어준다.
                //s1이 s2보다 작으면 음수, 같으면0크면 양수리턴
                .sorted((s1,s2)->Integer.compare(s1.getScore(),s2.getScore()))
                .forEach(s->System.out.println(s.getName()+":"+s.getScore()));
        System.out.println();
        //점수를 기준으로 내림차순으로 정렬한 새스트림얻기

        studentList.stream()
                .sorted((s1,s2)->Integer.compare(s2.getScore(),s1.getScore()))
                .forEach(s->System.out.println(s.getName()+":"+s.getScore()));
    }

}
