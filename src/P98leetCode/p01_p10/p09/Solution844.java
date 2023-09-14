package P98leetCode.p01_p10.p09;

import java.util.Stack;

public class Solution844 {
    public boolean backspaceCompare(String s, String t) {
        /*
        char[] arr = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != '#') {
                stack.push(arr[i]);
            } else if(!stack.isEmpty()){
                stack.pop();
            }
        }
        String str1 = stack.toString();
        stack.clear();
        char[] arr1 = t.toCharArray();
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != '#') {
                stack.push(arr1[i]);
            } else if(!stack.isEmpty()){
                stack.pop();
            }
        }
        String str2 = stack.toString();
        if (str1.equals(str2)) {
            return true;
        } else {
            return false;
        }
        */

        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '#') {
                if (stack1.size() > 0) {
                    stack1.pop();
                }
            } else {
                stack1.push(c);
            }
        }

        for (char c : t.toCharArray()) {
            if (c == '#') {
                if (stack2.size() > 0) {
                    stack2.pop();
                }
            } else {
                stack2.push(c);
            }
        }

        /*
        if (stack1.size() != stack2.size()) {
            return false;
        }

        while (stack1.size() > 0) {
            Character char1 = stack1.pop();
            Character char2 = stack2.pop();

            if (!char1.equals(char2)) {
                return false;
            }
        }
        */

        return stack1.equals(stack2);
    }
}
