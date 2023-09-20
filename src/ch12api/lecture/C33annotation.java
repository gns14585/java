package ch12api.lecture;

public class C33annotation {
    @MyAnnotation33(number = 3, name = "son")
    public static void main(String[] args) {
        @MyAnnotation33(number = 5, name = "lee", address = "jeju")
        int value;
    }
}


@interface MyAnnotation33 {
    // 여러가지 용어
    // parameter
    // argument
    // attribute *
    // element * 공식 문서 용어

    int number();
    String name();
    String address()default "seoul";
}
