package ch14thread.lecture;

public class C01sleep {
    public static void main(String[] args) throws InterruptedException {

        // 업무 흐름을 잠깐 멈추는 메소드
        // 출력이 바로바로 형성되지 않고 1000밀리세컨드 = 1초에 한번씩 나머지 출력됨
        System.out.println("code1");
        Thread.sleep(1000);
        System.out.println("code2");
        Thread.sleep(1000);
        System.out.println("code3");
    }
}
