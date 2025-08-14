package Ch3_BasicsSorting;

public class Leet268 {
    public static int missingNumber(int[] nums)
    {
        int i=0;
        while (i<nums.length) 
        {
            int correct = nums[i];
            if(nums[i] <nums.length && nums[i]!=nums[correct])
            {
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }else
            {
                i++;
            }
        }
        //search for missing numbers
        for(int index=0; index<nums.length; index++)
        {
            if(nums[index]!=index)
            {
                return index;
            }
        }
        return nums.length;
    }
    public static void main(String[] args) {
     
        int arr[] = {4,0,2,1};
        int ans =    missingNumber(arr);
        System.out.println(ans);
    }
}
