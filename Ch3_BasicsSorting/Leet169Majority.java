package Ch3_BasicsSorting;

import java.util.Arrays;

public class Leet169Majority {
    public static int majorityElement(int[] nums) 
    {
        Arrays.sort(nums);  // sort array first
        int majorityCount = nums.length / 2;

        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                count++;
            } else {
                count = 1; // reset count for new number
            }

            if (count > majorityCount) {
                return nums[i]; // found majority element
            }
        }

        return nums[0]; // fallback (majority always exists)
    }
    public static void main(String[] args) {
        int nums[] = {2,2,1,1,1,2,2};
        int ans = majorityElement(nums);
        System.out.println(ans);
    }
}
