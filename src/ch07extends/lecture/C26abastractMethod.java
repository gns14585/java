package ch07extends.lecture;

public class C26abastractMethod {
    public static void main(String[] args) {
        Dog26 d1 = new Dog26();
        d1.breath();

        Aniaml26 a1 = d1;
        a1.breath();

        Aniaml26 a2 = new Fish26();
        a2.breath();
    }
}

// 추상메소드를 가진 클래스는 꼭 추상 클래스가 되어야 함
abstract class Aniaml26 {
    // 추상메소드 : 몸통{}이 없는 메소드
    abstract public void breath();
}

// 부모의 추상메소드를 자식클래스는 꼭 재정의(Override) 해야함
class Dog26 extends Aniaml26 {

    @Override
    public void breath() {
        System.out.println("폐로 숨을 쉽니다.");
    }
}

class Fish26 extends Aniaml26 {
    @Override
    public void breath() {
        System.out.println("아가미로 숨을 쉽니다.");
    }
}


