package Ch1_Array_2d_arrList;

public class Q11_DistincElements {
    public static boolean distincElements(long arr[])
    {
        boolean found  = false;
        if(arr.length <=1)
        return found;

        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i] == arr[j])
                found = true;
            }
        }
        return found;
    }
    public static void main(String[] args) {
        
        long arr[] = {1,1};
        boolean ans = distincElements(arr);
        System.out.println(ans);
    }
}
