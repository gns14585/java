package ch07extends.lecture;

public class C30accessModifier {
    public static void main(String[] args) {
        // 접근제한자 ( access modifier )
        // public                           : 접근 제한 없음 (가장 넓은 범위)
        // protected                        : 같은 패키지 + 다른패키지 자손까지 가능
        // ( package private == default )   : 같은 패키지 내에서만 접근 가능
        // private                          : 클래스 내에서만 접근 가능 (가장 좁은 범위)

        MyClass30 o1 = new MyClass30();
        o1.publicMethod();
        // o1.privateMethod();  private은 같은 클래스내에서만 사용 가능해서 호출 불가
        o1.packagePrivateMethod();
        o1.protectedMethod();
    }
}


