package ch13generic.lecture;

import ch08interface.book.sec10.exam01.D;

public class C06wildcard {
    public static void main(String[] args) {
        Dog d = new Dog();
        Animal a1 = d;
        Cat c = new Cat();
        Animal a2 = c;

        MyClass06<Dog> o1 = new MyClass06<>();
//        MyClass06<Animal> o2 = o1;
//        o2.set(new Animal());
        // extends 해당 클래스 포함 자식클래스
        MyClass06<? extends Animal> o3= o1;
        MyClass06<? extends Animal> o6 = new MyClass06<Animal>();
        MyClass06<? extends Animal> o7 = new MyClass06<Dog>();
        MyClass06<? extends Animal> o8 = new MyClass06<Cat>();
        Animal ani1 = o3.get(); // 안전
//        o3.set(new Dog()); // 안전하지 않음
        ani1.animalMethod();

        // super 해당 클래스 포함 부모클래스
        MyClass06<? super Animal> o4 = new MyClass06<Animal>();
        MyClass06<? super Animal> o5 = new MyClass06<Object>();

        o4.set(new Dog());
        o5.set(new Dog());
        o4.set(new Cat());

    }
}

class Animal {
    public void animalMethod() {

    }
}
class Dog extends Animal {}
class Cat extends Animal {}

class MyClass06<T> {
    public void set(T param) {}
    public T get() {
        return null;
    }
}
