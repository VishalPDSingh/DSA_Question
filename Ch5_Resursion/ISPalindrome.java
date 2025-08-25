package Ch5_Resursion;

public class ISPalindrome {
    public static boolean palindrome(String str, int start, int end)
    {
      if(start>=end)
      return  true;
      return ((str.charAt(start)==str.charAt(end)) && palindrome(str, start+1, end-1));
    }
    public static void main(String[] args) {
        
        String str = "abba";
        int start = 0;
        int end = str.length()-1;
        boolean ans = palindrome(str, start, end);
        System.out.println(ans);
    }
}
