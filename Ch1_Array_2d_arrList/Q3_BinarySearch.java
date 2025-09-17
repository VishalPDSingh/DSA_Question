package Ch1_Array_2d_arrList;

public class Q3_BinarySearch {
    public static int binearSearch(int arr[], int key)
    {
       int start = 0;
       int end = arr.length-1;
       while (start<=end) {
        int mid = start+(end-start)/2;

        if(arr[mid] == key)
        {
            return mid;
        }else if(arr[mid] > key)
        {
            start = mid+1;
        }else
        {
            end = mid-1;
        }
       }
       return -1;
    }
    public static void main(String[] args) {
        
        int arr[] = {10,20,30,41,50,60,70};
        int key = 41;

        int ans = binearSearch(arr, key);
        System.out.println(ans);
    }
}
