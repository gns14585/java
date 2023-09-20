package ch12api.lecture;

public class C01object {
    public static void main(String[] args) {
        // Object
        // 모든 클래스의 상위 클래스
        // 모든 타입의 상위 타입
        String a = "java";
        Object o1 = a;
        o1.toString();

        Integer i = 3;
        Object o2 = i;
        o2.toString();

        C01object c = new C01object();
        Object o3 = c;
        o3.toString();

        int j = 30;
        Object o4 = j;

    }
}
