package Ch1_Array_2d_arrList;

public class Leet1929 {
    public static int[] concatenationOfArray(int nums[])
    {
        int n = nums.length;
        int arr[] = new int[n*2];

        for(int i=0; i<n; i++)
        {
            arr[i] = nums[i];
            arr[i+n] = nums[i];
        }
        return arr;
    }
    public static void main(String[] args) {
     int nums[] = {1,2,3,4};
     
     int arr[] = concatenationOfArray(nums);

     for(int ans:arr)
     {
        System.out.println(ans);
     }
    }
}
