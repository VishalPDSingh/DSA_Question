package Ch4_String;

public class Q5_EqualTo {
    public static boolean equalto(String s1, String s2)
    {
        for(int i=0; i<s1.length(); i++)
        {
            if(s1.charAt(i) != s2.charAt(i))
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String s1 = "visha1";
        String s2 = "vishal";

        boolean ans = equalto(s1, s2);
        System.out.println(ans);
    }
}
