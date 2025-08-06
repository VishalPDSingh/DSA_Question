package Ch1_Array_2d_arrList;

public class KadanesAlgo {

    public static void maxSubArray(int arr[])
    {
        int currSum =0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++)
        {
            currSum = arr[i] + currSum;
            if(maxSum < currSum)
            {
                maxSum = currSum;
            }
             if (currSum < 0) {
                currSum = 0;
             }
        }
        System.out.println(maxSum);
    }
    public static void main(String[] args) {
        int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
        maxSubArray(nums);
    }
}
