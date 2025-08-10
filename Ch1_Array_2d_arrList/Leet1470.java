package Ch1_Array_2d_arrList;

public class Leet1470 {
    public static int[] shuffle(int[] nums, int n)
    {
        int arr[] = new int[n*2];
        for(int i=0; i<n; i++)
        {
            arr[2*i] = nums[i];
            arr[2*i+1] = nums[n+i];
        }
        return arr;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,4,3,2,1};
     //   int n=4;
        int ans[] = shuffle(nums, 4);

        for(int result:ans)
        {
            System.out.println(result);
        }
    }
}
