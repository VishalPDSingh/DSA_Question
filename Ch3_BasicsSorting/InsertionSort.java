package Ch3_BasicsSorting;

public class InsertionSort {
    public static void insertionSort(int arr[])
    {
        for(int i=1; i<arr.length; i++)
        {
            int currValue = arr[i];
            int pre = i-1;

            // findig out the current position to insert
            while(pre >=0 && arr[pre]>currValue)
            {
                arr[pre+1] = arr[pre];
                pre--;
            }
            // insertion
            arr[pre+1] = currValue;
        }
        for(int ans:arr)
        {
            System.out.println(ans);
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,1,6,2,4,3};
        insertionSort(arr);
    }
}
