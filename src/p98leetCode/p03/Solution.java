package p98leetCode.p03;

import ch09nested.book.sec02.exam02.A;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        a.add(1);
        result.add(a);

        for (int i = 0; i < numRows; i++) {
            a = new ArrayList<>();
            b.add(1);

            for(int j = 1; j < i; j++) {
                int element = result.get(i - 1).get(j - 1) + result.get(i - 1).get(j);
                b.add(element);
            }
            b.add(1); // 모든 배열의 마지막 원소는 1이다. 이를 저장한다.
            result.add(b); // 완성된 배열을 result에 저장한다. 한개의 층이 완성된 것이다.
        }
        return result;




        }
    }

