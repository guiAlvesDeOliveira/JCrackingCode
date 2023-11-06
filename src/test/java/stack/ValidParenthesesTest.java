package stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class ValidParenthesesTest {
    @Test
    void test1(){
        ValidParentheses validator = new ValidParentheses();
        assertTrue(validator.isValid("()"));
    }
    @Test
    void test2(){
        ValidParentheses validator = new ValidParentheses();
        assertTrue(validator.isValid("()[]{}"));
    }
    @Test
    void test3(){
        ValidParentheses validator = new ValidParentheses();
        assertFalse(validator.isValid("()["));
    }
    @Test
    void test4(){
        ValidParentheses validator = new ValidParentheses();
        assertFalse(validator.isValid("(("));
    }
    @Test
    void test5(){
        ValidParentheses validator = new ValidParentheses();
        assertFalse(validator.isValid("){"));
    }
    @Test
    void test6(){
        ValidParentheses validator = new ValidParentheses();
        assertFalse(validator.isValid("(){}}{"));
    }
}
