package Ch1_Array_2d_arrList;

public class Q4_ReveseInArray {
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
    public static void main(String[] args) {
        int arr[] = {10,20,30,15,70};
        revesrArray(arr);
    }
}
