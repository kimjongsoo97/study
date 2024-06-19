package quiz.oo2;

public class Database {
    private String connection="MySQL";

    public String connect() {
        System.out.println(connection+"에 연결합니다");
//        System.out.println("데이터 베이스:MySQL");
        return connection;
    }
    public void close() {
        System.out.println(connection+"을닫습니다");
    }
}
