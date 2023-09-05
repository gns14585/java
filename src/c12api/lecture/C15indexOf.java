package c12api.lecture;

public class C15indexOf {
    public static void main(String[] args) {
        // indexOf : 특정 문자열이 시작하는 위치(index) 리턴
        String a = "spring";

        int ring = a.indexOf("ring");
        System.out.println(ring);

        System.out.println(a.indexOf("pr"));

        String b = "spring is spring";
        System.out.println(b.indexOf("ring"));

        int ring1 = b.indexOf("ring", 2);
        System.out.println(ring1);

        System.out.println(b.indexOf("ring", 3));
    }
}
