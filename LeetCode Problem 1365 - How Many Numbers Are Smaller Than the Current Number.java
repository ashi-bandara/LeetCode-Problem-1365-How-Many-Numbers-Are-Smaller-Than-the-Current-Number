import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] sortedNums = Arrays.copyOf(nums, nums.length);
        Arrays.sort(sortedNums);

        Map<Integer, Integer> numCount = new HashMap<>();

        for (int i = 0; i < sortedNums.length; i++) {
            numCount.putIfAbsent(sortedNums[i], i);
        }

        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            result[i] = numCount.get(nums[i]);
        }

        return result;
    }
}
