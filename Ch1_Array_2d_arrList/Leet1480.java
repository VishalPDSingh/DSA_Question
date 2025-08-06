package Ch1_Array_2d_arrList;

public class Leet1480 {
    public static int[] runningSum(int nums[])
    {
        int sum[] = new int[nums.length];
        sum[0] = nums[0];

        for(int i=1; i<nums.length; i++)
        {
            sum[i] = sum[i-1] + nums[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};

        int ans[] = runningSum(arr);

        for(int value:ans)
        {
            System.out.println(value);
        }
    }
}
