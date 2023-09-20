package ch12api.lecture;

public class C34annotation {
    @MyAnnotation34(value = "seoul", address = "jeju")
    int field;
    public static void main(String[] args) {

    }
}

@interface MyAnnotation34 {
    // elements ( attributes )

    // value element는 사용시 생략 가능 @MyAnnotation34("seoul")
    // 단, 다른 element와 같이 사용 시 생략 불가 @MyAnnotation34(value = "seoul", address = "jeju")
    String value();
    String address();
}
