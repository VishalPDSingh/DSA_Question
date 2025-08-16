package Ch3_BasicsSorting;

public class Leet268_MissingNumber {
    public static int  missingNumber(int[] nums)
    {
        if(nums == null || nums.length <=1)
        {
            return;
        }
       // find the largest number in the array
       int max = nums[0];
       for(int arr:nums)
       {
        if(max < arr)
        {
            max = arr;
        }
       }

       // creating count array length is max+1
       int count [] = new int[max+1];

       for(int i=0; i<nums.length; i++)
       {
            count[nums[i]]++;
       }

       // sorting
       int index = 0;
       for(int i=0; i<count.length; i++)
       {
         while (count[i] > 0)
         {
            if(nums[index] == i)
            {
                index++;
                count[i]--;
            }
         }
       }
    }
    public static void main(String[] args) {
        int nums[] = {0,4,1,2};
       missingNumber(nums);

    }
}
