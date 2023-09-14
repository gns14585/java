package ch11exception.lecture;

public class C14throw {
    public static void main(String[] args) {
        System.out.println("main code1");
        try {
            method3();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("main code2");
    }

    // checked Exception은 메소드명에 thorws Exception 같이 같이 기재해줘야함
    private static void method3() throws Exception {
        throw new Exception();
    }
}
