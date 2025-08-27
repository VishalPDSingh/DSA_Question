package Ch4_String;

import java.util.Scanner;

public class Q3_find_Pos_middle_index {


    public static int positionOfmiddleChar(String str, char ch)
    {
       
        int start=0;
        int end = str.length()-1;

        while (start<=end) {
            if(ch==str.charAt(start))
            {
                start++;
            }
            if(ch==str.charAt(end))
            {
                end--;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of String");
        String s = sc.nextLine();
        System.out.println("Enter the char to find the poasition: ");
        char ch = sc.nextLine().charAt(0);
    }
}
