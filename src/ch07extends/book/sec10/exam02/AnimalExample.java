package ch07extends.book.sec10.exam02;

public class AnimalExample {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.sound();

        Cat c1 = new Cat();
        c1.sound();

        animalSound(new Dog());
        animalSound(new Cat());
    }

    private static void animalSound(Animal ani) {
        ani.sound();
    }
}
