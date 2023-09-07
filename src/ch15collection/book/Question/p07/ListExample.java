package ch15collection.book.Question.p07;
import java.util.*;
public class ListExample {
    public static void main(String[] args) {
        BoardDao dao = new BoardDao();
        List<Board> list = dao.getBoardList();
        for(Board board : list) {
            System.out.println(board.getTitle() + "-" + board.getContent());
        }

        boolean f1 = list.contains(new Board("제목1", "내용1"));
        System.out.println(f1);
    }
}


