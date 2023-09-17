package ch18io.lecture;

public class C26printf {
    public static void main(String[] args) {
        // %s : 문자열 출력
        System.out.printf("문자열 : %s%n", "java");
        System.out.printf("문자열 1 : %s%n문자열 2 : %s%n", "css", "react");

        // %d : 정수 십진법 출력
        System.out.printf("정수 : %d%n", 99);
        System.out.printf("정수 1 : %d%n정수 2 : %d%n", 100, 200);
//        System.out.printf("정수 3 : %d%n", "java");

        // argument_index$
        System.out.printf("정수 1 : %2$d%n정수 2 : %1$d%n", 100, 200);
        System.out.printf("정수 : %1$d%n", 9, 8);
        System.out.printf("정수 : %2$d%n", 9, 8);



    }
}
