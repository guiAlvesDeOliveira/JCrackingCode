package arrays_hashing;

import java.util.*;

public class TopKFrequent {
    public int[] topKFrequent(int[] nums, int k) {
        int[] answer = new int[k];
        Map<Integer, List<Integer>> counter = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!counter.containsKey(nums[i])) {
                counter.put(nums[i], new ArrayList<>());
            }
            counter.get(nums[i]).add(nums[i]);
        }
        List<Map.Entry<Integer, List<Integer>>> entryList = new ArrayList<>(counter.entrySet());
        entryList.sort(Comparator.comparingInt(entry -> entry.getValue().size()));
        Collections.reverse(entryList);

        for (int i = 0; i < k; i++) {
            answer[i] = entryList.get(i).getKey();
        }


        return answer;
    }
}
