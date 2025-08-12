package Ch2_Searching;

public class Leet852 {
    public static int peakIndexInMountainArray(int[] arr)
    {
        int start = 0;
        int end = arr.length-1;
        
        while(start < end)
        {
            int mid = start + (end - start)/2;
            if(arr[mid] >arr[mid+1] && arr[mid]>arr[mid-1])
            {
                return mid;
            }
           else if(arr[mid] < arr[mid+1])
            {
                start = mid+1;
            }else
            {
                end = mid-1;
            }
        }
        return start;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,3,2};
        int ans = peakIndexInMountainArray(nums);
        System.out.println(ans);
    }
}
