package Ch4_String;

public class Q11_Space_Count {
    public static int countSpace(String s)
    {
        int count=0;
        for(int i=0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            if(ch == ' ')
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        String str = "  Vis  ";

        int ans = countSpace(str);
        System.out.println(ans);
    }
}
