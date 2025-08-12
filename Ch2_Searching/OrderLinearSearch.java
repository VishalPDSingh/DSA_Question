package Ch2_Searching;

public class OrderLinearSearch {
    public static int linearOrderSearch(int arr[], int key)
    {
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] == key)
            {
                return i;
            }else if(arr[i] > key)
            {
                System.out.println("vishal");
                return -1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {10,20,30,50,90};
        int key = 5;

        int ans = linearOrderSearch(arr, key);
        System.out.println(ans);
    }
}
