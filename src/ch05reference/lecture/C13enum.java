package ch05reference.lecture;

public class C13enum {
    public static void main(String[] args) {
        MyEnum v1 = MyEnum.VALUE1;
        MyEnum v2 = MyEnum.VALUE2;
        MyEnum v3 = MyEnum.VALUE3;
        MyEnum v4 = MyEnum.MY_FIRST_VALUE;
        MyEnum v5 = MyEnum.VALUE3;

        // enum 타입은 비교할때 == 사용 해주는게 안전함 ( 값이 한정되어 있기 때문에 )
        System.out.println("(v1 == v2) = " + (v1 == v2)); // false
        System.out.println("(v1 == v4) = " + (v1 == v4)); // false
        System.out.println("(v3 == v5) = " + (v3 == v5)); // 같은 타입(값)의 enum을 비교하면 true

        // equals 사용 가능 하지만 추천 안함
        System.out.println("v1.equals(v2) = " + v1.equals(v2)); // false
        System.out.println("v3.equals(v5) = " + v3.equals(v5)); // true

    }
}

enum MyEnum {
    // 콤마로 구분한 값 나열
    // 값의 이름 작성 관습 : UPPER_SANKE_CASE (모든문자 대문자, 여러단어 연결될경우 _언더바로 작성 )
    // ex) MY_FIRST_VALUE
    VALUE1,
    VALUE2,
    VALUE3,
    MY_FIRST_VALUE
}
