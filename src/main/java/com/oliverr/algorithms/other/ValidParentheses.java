package com.oliverr.algorithms.other;

import java.util.Stack;

public class ValidParentheses {
    
    public boolean isValidParentheses(String parentheses) {
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < parentheses.length(); i++) {
            char opposite = oppositeParenthese(parentheses.charAt(i));
            if(isLeft(parentheses.charAt(i))) stack.push(parentheses.charAt(i));
            else if(stack.isEmpty() || stack.pop() != opposite) return false;
        }

        return stack.isEmpty();
    }

    public char oppositeParenthese(char c) {
        if(c == ')') return '(';
        if(c == '(') return ')';
        if(c == '[') return ']';
        if(c == ']') return '[';
        if(c == '}') return '{';
        if(c == '{') return '}';
        return ' ';
    }
    
    public boolean isLeft(char c) {
        if(c == '{') return true;
        if(c == '(') return true;
        if(c == '[') return true;
        return false;
    }

}
