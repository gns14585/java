package ch11exception.lecture;

public class C12polymorphism {
    public static void main(String[] args) {
        try {
            // ClassCastException
            // NullPointerException
            // ArithmeticException
        } catch (ClassCastException e) {
            // ClassCastException
            // 예외 처리
        } catch (RuntimeException e) {
            // NullpointerException
            // ArithmeticException
            // 예외 처리
        }
    }
}
