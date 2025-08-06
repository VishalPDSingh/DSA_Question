package Ch1_Array;

public class PairIn_Array {

    public static void pairs_Array(int arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            for(int j= i+1; j<arr.length; j++)
            {
                System.out.print("(" +arr[i]+" "+arr[j]+")");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,4};
        pairs_Array(nums);
    }
}
