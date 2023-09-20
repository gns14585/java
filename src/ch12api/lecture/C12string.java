package ch12api.lecture;

public class C12string {
    public static void main(String[] args) {
        // length : 길이
        String a = "java";
        String b = "spring";
        String c = "hello world";
        String d = "hi java  ";

        System.out.println(a.length());
        System.out.println(b.length());
        System.out.println(c.length());
        System.out.println(d.length());

        // text block
        String e = """
                hello world
                hi java
                greeting spring
                """;
        System.out.println(e.length());
    }
}
