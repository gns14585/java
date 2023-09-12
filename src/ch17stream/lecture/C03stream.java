package ch17stream.lecture;

import java.util.List;
import java.util.stream.Stream;

public class C03stream {
    public static void main(String[] args) {
        List<String> list = List.of("java", "css", "spring" );
        Stream<String> stream = list.stream();

        stream.count();

        // 최종 연산이 끝난 stream은 재사용 할 수 없음
//        stream.count(); // exception 에러

        // 다시 만들어서 연산 해야함
        Stream<String> stream2 = list.stream();
        stream2.count();

        System.out.println();
    }
}
