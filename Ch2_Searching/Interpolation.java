package Ch2_Searching;

public class Interpolation {
    public static int interpolationSearch(int arr[], int key)
    {
        int low  =0;
        int high = arr.length-1;

        while (low<=high) {
            int mid = low +((key-arr[low])*(high-low))/(arr[high] - arr[low]);
            if(arr[mid]==key)
            return mid;
            if(arr[mid] > key)
            high = mid-1;
            else
            low = mid+1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,3,5,7,9,11,13,15};
        int key = 13;
        int ans = interpolationSearch(arr, key);
        System.out.println(ans);
    }
}
