package Ch3_BasicsSorting;

public class CountSort {

    public static void countSort(int arr[])
    {
        int largest = Integer.MIN_VALUE;
        // findig the largest number
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] > largest)
            largest = arr[i];
        }
        //creating array 
        int count[] = new int[largest+1];

        for(int i=0; i<arr.length; i++)
        {
            count[arr[i]]++;
        }

        //sorting
        int j=0;
        for(int i=0; i<count.length; i++)
        {
            while (count[i]>0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
        for(int ans:arr)
        {
            System.out.println(ans);
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,4,1,3,2,4,3,7};
        countSort(arr);
    }
}
