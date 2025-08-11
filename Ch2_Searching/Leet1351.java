package Ch2_Searching;

public class Leet1351 {
    public static int countNegatives(int[][] a)
    {
        int count =0;
        for(int i=0; i<a.length; i++)
        {
            for(int j=0; j<a[0].length; j++)
            {
                if(a[i][j]<0)
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[][] = {{4,3,2,-1},
                       {3,2,1,-1},
                       {1,1,-1,-2},
                       {-1,-1,-2,-3}};
        int ans = countNegatives(arr);
        System.out.println(ans);
        
    }
}
