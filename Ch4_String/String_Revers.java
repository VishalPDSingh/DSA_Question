package Ch4_String;

public class String_Revers {
    public static String reverse(String s)
    {
        String str = "";
        for(int i=s.length()-1; i>=0; i--)
        {
            char ch = s.charAt(i);
            str = str+ch;
        }
        return str;
    }
    public static void main(String[] args) {
        
        String s = "Hello";
        String ans = reverse(s);
        System.out.println(ans);
    }
}
