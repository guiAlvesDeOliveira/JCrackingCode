package arrays_hashing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestConsecutiveSequenceTest {
    @Test
    void test1() {
        LongestConsecutiveSequence validator = new LongestConsecutiveSequence();
        int nums[] = new int[] {100,4,200,1,3,2};
        assertEquals(4, validator.longestConsecutive(nums));
    }
    @Test
    void test2() {
        LongestConsecutiveSequence validator = new LongestConsecutiveSequence();
        int nums[] = new int[] {0,3,7,2,5,8,4,6,0,1};
        assertEquals(9, validator.longestConsecutive(nums));
    }
    @Test
    void test3() {
        LongestConsecutiveSequence validator = new LongestConsecutiveSequence();
        int nums[] = new int[] {};
        assertEquals(0, validator.longestConsecutive(nums));
    }
    @Test
    void test4() {
        LongestConsecutiveSequence validator = new LongestConsecutiveSequence();
        int nums[] = new int[] {9,1,4,7,3,-1,0,5,8,-1,6};
        assertEquals(7, validator.longestConsecutive(nums));
    }
}
