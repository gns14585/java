package c12api.book.Question.Q2;

public class C11string {
    public static void main(String[] args) {
        // String
        String a = "java";
        String b = "java";
        String c = new String("java");

        System.out.println(a == b);
        System.out.println(a == c);

        System.out.println(a.equals(b));
        System.out.println(a.equals(c));

    }
}
