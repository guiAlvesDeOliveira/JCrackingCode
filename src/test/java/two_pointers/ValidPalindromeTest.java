package two_pointers;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class ValidPalindromeTest {
    @Test
    void test1(){
        ValidPalindrome validator = new ValidPalindrome();
        assertTrue(validator.isPalindrome("A man, a plan, a canal: Panama"));
    }
    @Test
    void test2(){
        ValidPalindrome validator = new ValidPalindrome();
        assertFalse(validator.isPalindrome("race a car"));
    }
}
