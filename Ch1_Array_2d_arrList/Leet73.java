package Ch1_Array_2d_arrList;

public class Leet73 {
     public static void setZeroes(int[][] matrix)
     {
        for(int i=0; i<matrix.length; i++)
        {
            for(int j=0; j<matrix[0].length; j++)
            {
                if(matrix[i][j] == 0)
               {
                
               }
            }
        }
        
     }
    public static void main(String[] args) {
        
        int arr[][] = {{1,2,3},
                       {4,0,5},
                       {6,7,8} };
        setZeroes(arr);
    }
}
