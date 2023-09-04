package ch16lambda.book.Question.exam01;

public class Example {
    public static void main(String[] args) {
        // 람다
        Button btnOk = new Button();
        btnOk.setClickListener(() -> System.out.println("OK 버튼을 클릭했습니다."));
        btnOk.click();

        // 익명 함수
        Button btnCancel = new Button();
        btnCancel.setClickListener(new Button.ClickListener() {
            @Override
            public void onClick() {
                System.out.println("Cancel 버튼을 클릭했습니다.");
            }
        });
        btnCancel.click();
    }
}
