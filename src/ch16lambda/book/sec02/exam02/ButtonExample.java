package ch16lambda.book.sec02.exam02;

public class ButtonExample {
    public static void main(String[] args) {
        Button okBtn = new Button();
        okBtn.setClickListener(() -> System.out.println("Ok 버튼을 클릭합니다."));
        okBtn.click();

        Button CancelBtn = new Button();
        CancelBtn.setClickListener(() -> System.out.println("Cancel 버튼을 클릭합니다."));
        CancelBtn.click();
    }
}
