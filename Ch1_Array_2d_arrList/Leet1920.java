public class Leet1920 {
    public static int [] bulidArray(int arr[])
    {
        int nums[] = new int[arr.length];
        for(int i=0; i<arr.length; i++)
        {
            nums[i] = arr[arr[i]];
        }
        return nums;
    }
    public static void main(String[] args) {
        int arr[] = {0,2,1,5,3,4};
        int nums[] = bulidArray(arr);

        for(int array:nums)
        {
            System.out.println(array);
        }
    }
}
