import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Algo {
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if(s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> uniqueArray = new HashSet<>();
        for (int element: nums) {
            if (uniqueArray.contains(element)) return true;
            uniqueArray.add(element);
        }
        return false;
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> complementMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (complementMap.containsKey(complement)) return new int[]{complementMap.get(complement), i};
            complementMap.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two elements add up to the target.");
    }
}
