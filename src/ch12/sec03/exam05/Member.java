package ch12.sec03.exam05;

import lombok.Data;
import lombok.NonNull;
//ctrl alt o 는 안쓰는 임포트 제거
@Data
public class Member {
    private String id;
    //@NonNull: null이면 안되는 필수 항목
    @NonNull //필수항목 ->@RequiredArgsConstructor에 의해 생성자 추가됨
    private String name;
    private int age;
}
