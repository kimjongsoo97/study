package ch07.sec09;

public class InstanceofExample {
//main() 메소드에서 바로호출하기 위해 정적메소드 선언
public static void personInfo(Person person) {
    System.out.println("name = " + person.name);
    person.walk();

    //person이 참조하는 객체가 Student 타입인지 확인
//    if (person instanceof Student) {
//        //Student 객체일 경우 강제 타입변환
//        Student student = (Student) person;
//        //student 객체만 가지고 있는 필드 및 메소드사용
//        System.out.println("studentNo" + student.studentNo);
//        student.study();
//
//    }
    //person이 참조하는 객체가 Student 타입일 경우
    //student 변수에 대입(타입 변환 생성)
    if (person instanceof Student student) {
        System.out.println("studentNo" + student.studentNo);
        student.study();
    }

}

    public static void main(String[] args) {
//    person 객체를 매개값으로 제공하고 personInfo() 메소드를 호출
        Person p1 = new Person("홍길동");
        personInfo(p1);
        System.out.println();
        Person p2 = new Student("김길동", 10);
        personInfo(p2);
    }
}
