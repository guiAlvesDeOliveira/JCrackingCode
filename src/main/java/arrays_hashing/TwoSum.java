package arrays_hashing;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (i+1 < nums.length){
                for (int j = i+1; j < nums.length; j++) {
                    if (nums[i] + nums[j] == target){
                        answer[0] = i;
                        answer[1] = j;
                    }
                }

            }
        }
        return answer;
    }
}
