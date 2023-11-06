package stack;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }

        Stack<Character> open = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (isOpen(s.charAt(i))) {
                open.push(s.charAt(i));
            } else {
                if (open.size() == 0) return false;
                char c = open.pop();
                switch (c) {
                    case '(':
                        if (s.charAt(i) == ')') break;
                        else return false;
                    case '[':
                        if (s.charAt(i) == ']') break;
                        else return false;
                    case '{':
                        if (s.charAt(i) == '}') break;
                        else return false;
                }
            }
        }

        if (open.size() != 0) return false;

        return true;
    }

    boolean isOpen(char c) {
        if (c == '(' || c == '[' || c == '{') {
            return true;
        }
        return false;
    }

}
