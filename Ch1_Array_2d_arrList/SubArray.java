package Ch1_Array_2d_arrList;

public class SubArray {
    public static void subArray(int arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            for(int j=i; j<arr.length; j++)
            {
                System.out.print("("+arr[i]+" "+arr[j]+")");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int nums [] = {1,2,3,4};
        subArray(nums);
    }
}
