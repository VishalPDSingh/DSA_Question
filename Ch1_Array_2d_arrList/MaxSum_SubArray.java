package Ch1_Array_2d_arrList;

public class MaxSum_SubArray {
    public static void MaxSumSub(int arr[])
    {
        int max = 0;
        for(int i=0; i<arr.length; i++)
        {
            for(int j=i; j<arr.length; j++)
            {
               int sum = arr[i]+arr[j];
               if(sum > max)
               {
                max = sum;
            }
        }
    }
    System.out.print(max);
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,4};
        MaxSumSub(nums);
    }
}
