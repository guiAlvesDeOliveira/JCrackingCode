package arrays_hashing;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {
    @Test
    void test1(){
        TwoSum validator = new TwoSum();
        int[] nums = new int[]{2,7,11,15};
        int[] expected = new int[]{0,1};
        assertArrayEquals(expected, validator.twoSum(nums, 9));
    }
    @Test
    void test2(){
        TwoSum validator = new TwoSum();
        int[] nums = new int[]{3,3};
        int[] expected = new int[]{0,1};
        assertArrayEquals(expected, validator.twoSum(nums, 6));
    }
    @Test
    void test3(){
        TwoSum validator = new TwoSum();
        int[] nums = new int[]{3,2,4};
        int[] expected = new int[]{1,2};
        assertArrayEquals(expected, validator.twoSum(nums, 6));
    }
}
