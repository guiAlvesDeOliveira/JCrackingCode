package arrays_hashing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class ContainsDuplicateTest {

    @Test
    void test1() {
        ContainsDuplicate validator = new ContainsDuplicate();
        int[] nums = new int[]{1, 2, 3, 1};
        assertTrue(validator.containsDuplicate(nums));
    }

    @Test
    void test2() {
        ContainsDuplicate validator = new ContainsDuplicate();
        int[] nums = new int[]{1, 2, 3, 4};
        assertFalse(validator.containsDuplicate(nums));
    }

    @Test
    void test3() {
        ContainsDuplicate validator = new ContainsDuplicate();
        int[] nums = new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        assertTrue(validator.containsDuplicate(nums));
    }
    

}
