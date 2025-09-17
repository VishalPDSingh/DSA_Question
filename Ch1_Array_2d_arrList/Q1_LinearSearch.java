package Ch1_Array_2d_arrList;

public class Q1_LinearSearch {
    public static int linearSearch(int arr[], int key)
    {
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] == key)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        
        int arr[] = {10,5,41,2,36,80,12,20,10};
        int key = 41;
        int ans = linearSearch(arr, key);
        if(ans == -1)
        {
            System.out.println("Elemnets is found ");
        }else 
        {
            System.out.println("Elements present at index "+ans);
        }
    }
}
