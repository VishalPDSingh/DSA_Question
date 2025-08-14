package Ch3_BasicsSorting;

import java.util.Arrays;

public class Leet169 {
    public static int majorityElement(int[] nums) 
    {
        Arrays.sort(nums);
        return nums[nums.length/2];  
    }
    public static void main(String[] args) {
        int arr[] = {2,2,1,1,1,2,2};
        int ans = majorityElement(arr);
        System.out.println(ans);
    }
}
