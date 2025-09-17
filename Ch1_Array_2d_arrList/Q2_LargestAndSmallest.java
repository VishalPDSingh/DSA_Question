package Ch1_Array_2d_arrList;

public class Q2_LargestAndSmallest {
    public static int maxNum(int arr[])
    {
        int max = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]>max)
            max = arr[i];
        }
        return max;
    }

    public static int minNum(int arr[])
    {
        int min = Integer.MAX_VALUE;

        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]<min)
            min = arr[i];
        }
        return min;
    }
    public static void main(String[] args) {
        
        int arr[] = {10,20,40,4,6,70,30,22,41};
        int asn1 = maxNum(arr);
        System.out.println("Max value is "+asn1);

        int ans2 = minNum(arr);
        System.out.println("Min Value is "+ans2);
    }
}
