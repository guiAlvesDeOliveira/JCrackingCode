package arrays_hashing;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TopKFrequentTest {

    @Test
    void test1() {
        TopKFrequent validator = new TopKFrequent();
        int[] nums = new int[]{1,1,1,2,2,3};
        int[] expected = new int[]{1,2};
        assertArrayEquals(expected, validator.topKFrequent(nums, 2));
    }

    @Test
    void test2() {
        TopKFrequent validator = new TopKFrequent();
        int[] nums = new int[]{1};
        int[] expected = new int[]{1};
        assertArrayEquals(expected, validator.topKFrequent(nums, 1));
    }

    @Test
    void test3() {
        TopKFrequent validator = new TopKFrequent();
        int[] nums = new int[]{1,2,2,2,2,3,3,3};
        int[] expected = new int[]{2};
        assertArrayEquals(expected, validator.topKFrequent(nums, 1));
    }


}
