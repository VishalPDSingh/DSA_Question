package Ch2_Searching;

public class Leet1351BS {
    public static int negativeCount(int arr[][])
    {
        int i=0; 
        int j = arr[0].length-1;
        int count = 0;

        while(i<arr.length && j>=0)
        {
            if(arr[i][j] < 0)
            {
                count++;
                j--;
            }else
            {
                i++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[][] = {{4,3,2,-1},
                       {3,2,1,-1},
                       {1,1,-1,-2},
                       {-1,-1,-2,-3}};
        int ans = negativeCount(arr); 
        System.out.println(ans); 
    }
}
