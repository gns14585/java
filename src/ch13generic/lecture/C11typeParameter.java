package ch13generic.lecture;

import ch07extends.book.sec10.exam02.Animal;

public class C11typeParameter {
    public static void main(String[] args) {

    }
}

class MyClass11<T extends Animal> {
    public void method(T param) {
        param.equals(null);
        param.toString();
        param.hashCode();
    }
}
