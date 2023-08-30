package ch07extends.book.sec10.exam01;

abstract public class Phone {
    String owner;

    public Phone(String owner) {
        this.owner = owner;
    }

    abstract void turnOn();
    abstract void turnOff();
}
