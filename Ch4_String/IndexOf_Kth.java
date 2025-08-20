package Ch4_String;

import java.util.Scanner;

public class IndexOf_Kth {

    public static int indexOf_kth(String s, char c, int k)
    {
        int count = 0;
        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i)== c)
            {
                count++;
                if(count == k)
                {
                    return i;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of String: ");
        String str = sc.nextLine();
        System.out.println("Enter the value of charter");
       char ch = sc.nextLine().charAt(0); // read charcter

       System.out.println("Enter the postion of character: ");
       int k = sc.nextInt();

       System.out.println(indexOf_kth(str, ch, k));
       sc.close();
    }
}
