package arrays_hashing;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        int ans = 1;
        Set<Integer> sequence = new HashSet<>();
        for (int num : nums) sequence.add(num);
        for (int num : nums) {
            if (!sequence.contains(num - 1)) {
                int count = 1;
                while (sequence.contains(num + 1)) {
                    num++;
                    count++;
                }
                ans = Math.max(ans, count);
            }
        }

        return ans;
    }
}
