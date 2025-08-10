package Ch3_BasicsSorting;

public class BubbleSort {

    public static void bubble_sort(int arr[])
    {
        int n = arr.length;
        for(int i=0; i<n; i++)
        {
            for(int j=1; j<n-i; j++)
            {
                if(arr[j]>arr[j-1])
                {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        
        }
        for(int ans:arr)
        {
            System.out.print(ans+" ");
        }
    }
    public static void main(String[] args) {
        int nums[] = {3,1,5,4,2};
        bubble_sort(nums);
    }
}
