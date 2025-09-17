package Ch1_Array_2d_arrList;

public class Q5_PairsInArray {
    public static void pairsArray(int arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            int currValue = arr[i]; // 2 4 6 10
            for(int j=i+1; j<arr.length; j++)
            {
                System.out.print("("+currValue+","+arr[j]+")");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,10};
        pairsArray(arr);
    }
}
