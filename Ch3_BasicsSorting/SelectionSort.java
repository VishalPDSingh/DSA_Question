package Ch3_BasicsSorting;

public class SelectionSort {
    public static void selectionSort(int arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            int minValue = i;
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[minValue]>arr[j])
                {
                    minValue = j;
                }
            }
            //swap
            int temp = arr[i];
            arr[i] = arr[minValue];
            arr[minValue] = temp;
        }
        for(int ans:arr)
        {
            System.out.print(ans+",");
        }
    }
    public static void main(String[] args) {
        int arr[] = {38,52,9,18,6,62,13};
        selectionSort(arr); 
    }
}
