package ch07extends.book.sec09.exam01;

public class ExtendsExample {
    public static void main(String[] args) {
        InterfaceCImpl impl = new InterfaceCImpl();
        impl.methodA();
        impl.methodB();
        impl.methodC();
        System.out.println();

        InterfaceA ia = impl;
        ia.methodA();
        System.out.println();

        InterfaceB ib = impl;
        ib.methodB();
        System.out.println();

        InterfaceC ic = impl;
        ic.methodA();
        ic.methodB();
        ic.methodC();
    }
}
