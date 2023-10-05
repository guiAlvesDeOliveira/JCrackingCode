package arrays_hashing;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ValidAnagramTest {

    @Test
    void test1(){
        ValidAnagram validator = new ValidAnagram();
        assertTrue(validator.isAnagram("anagram", "nagaram"));
    }
    @Test
    void test2(){
        ValidAnagram validator = new ValidAnagram();
        assertFalse(validator.isAnagram("rat", "car"));
    }
}
