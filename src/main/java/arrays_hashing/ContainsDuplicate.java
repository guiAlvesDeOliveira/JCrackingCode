package arrays_hashing;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> uniques = new HashSet<>();
        for (int n : nums) {
            if (uniques.contains(n)) {
                return true;
            }
            uniques.add(n);
        }
        return false;
    }
}
