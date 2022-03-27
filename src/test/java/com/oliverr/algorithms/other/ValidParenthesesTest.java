package com.oliverr.algorithms.other;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidParenthesesTest {
    
    ValidParentheses vp;

    @Test
    void testIsValidParentheses() {
        vp = new ValidParentheses();
        Assertions.assertEquals(true, vp.isValidParentheses("[]"));
        Assertions.assertEquals(true, vp.isValidParentheses("{}"));
        Assertions.assertEquals(true, vp.isValidParentheses("()"));
        Assertions.assertEquals(true, vp.isValidParentheses("()[]"));
        Assertions.assertEquals(true, vp.isValidParentheses("{}[]"));
        Assertions.assertEquals(true, vp.isValidParentheses("[{}[]]"));
        Assertions.assertEquals(true, vp.isValidParentheses("[{}]"));
        Assertions.assertEquals(true, vp.isValidParentheses("[{}][]"));
        Assertions.assertEquals(true, vp.isValidParentheses("[{}][]{()}"));
        Assertions.assertEquals(true, vp.isValidParentheses("([{}][]{()})[]"));
        Assertions.assertEquals(false, vp.isValidParentheses("({}][]{()})]"));
        Assertions.assertEquals(false, vp.isValidParentheses("([{}][]{())[]"));
        Assertions.assertEquals(false, vp.isValidParentheses("([{}][]{()"));
        Assertions.assertEquals(false, vp.isValidParentheses("([[]{()"));
    }

}
