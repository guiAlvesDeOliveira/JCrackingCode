package arrays_hashing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductOfArrayExceptSelfTest {

    @Test
    void test1() {
        ProductOfArrayExceptSelf validator = new ProductOfArrayExceptSelf();
        int[] nums = new int[]{1, 2, 3, 4};
        int[] expected = new int[]{24, 12, 8, 6};
        assertArrayEquals(expected, validator.productExceptSelf(nums));
    }
    @Test
    void test2() {
        ProductOfArrayExceptSelf validator = new ProductOfArrayExceptSelf();
        int[] nums = new int[]{-1,1,0,-3,3};
        int[] expected = new int[]{0,0,9,0,0};
        assertArrayEquals(expected, validator.productExceptSelf(nums));
    }
}
