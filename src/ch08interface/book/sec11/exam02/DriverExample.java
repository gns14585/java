package ch08interface.book.sec11.exam02;

public class DriverExample {
    public static void main(String[] args) {
        Driver dr = new Driver();
        dr.drv(new Bus());
        dr.drv(new Taxi());

        /*
        인터페이스에 사용 할 메소드 선언
        클래스파일에 메소드 선언 후 매개변수에 인터페이스명 기재
        부모 인터페이스를 구현한 bus, taxi 생성
        구현한 bus랑 taxi 는 메소드 오버라이딩
        메인 클래스파일에서 매개변수 기재한 클래스파일 객체 생성
        해당 객체의 참조변수.객체의 메소드명(new 객체생성)
         */
    }
}
