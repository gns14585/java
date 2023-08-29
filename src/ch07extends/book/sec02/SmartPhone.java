package ch07extends.book.sec02;

public class SmartPhone extends Phone {
    public boolean wifi;                                    // 인스턴스 변수

    public SmartPhone(String model, String color) {         // 자식 생성자
        this.model = model;
        this.color = color;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
        System.out.println("와이파이 상태를 변경합니다.");
    }

    public void internet() {
        if(wifi == true)
             System.out.println("인터넷에 연결합니다.");
        else
            System.out.println("인터넷 연결이 끊어집니다.");
    }
}
