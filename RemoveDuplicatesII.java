import java.util.Arrays;

public class RemoveDuplicatesII {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3, 3, 3, 4};
        
        Solution solution = new Solution();
        int newLength = solution.removeDuplicates(nums);
        
        System.out.println("New length: " + newLength);
        System.out.println("Array after removing extra duplicates: " + Arrays.toString(Arrays.copyOf(nums, newLength)));
    }
}

class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2) return nums.length;

        int i = 2;
        for (int j = 2; j < nums.length; j++) {
            if (nums[j] != nums[i - 2]) { 
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}
