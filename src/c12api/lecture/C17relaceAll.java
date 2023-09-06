package c12api.lecture;

public class C17relaceAll {
    public static void main(String[] args) {
        // relaceAll
        String a = "JAVA is java";
        String r = a.replace("java", "python");
        System.out.println(r);

        String r2 = a.replaceAll("(java|JAVA)", "python");
        System.out.println(r2);
    }
}
