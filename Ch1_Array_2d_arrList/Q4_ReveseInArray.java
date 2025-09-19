package Ch1_Array_2d_arrList;

public class Q4_ReveseInArray {

    // Method 1
    public static void revesrArray(int arr[])
    {
        int start = 0;
        int end = arr.length-1;
        while (start<end) {
            // swap the value 
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        for(int ans:arr)
        {
            System.out.println(ans);
        }
    }

    // Method 2 
    public static void revesrArrayM2(int arr[])
    {
       // int n = arr.length-1;
        int ar[] = new int[arr.length];
        for(int i = 0; i<ar.length; i++)
        {
            ar[i] = arr[arr.length-1-i];
        }
        for(int ans:ar)
        {
            System.out.print(ans+ " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {10,20,30,15,70};
        revesrArray(arr);
        System.out.println("--------------------------------");
        revesrArrayM2(arr);
    }
}
