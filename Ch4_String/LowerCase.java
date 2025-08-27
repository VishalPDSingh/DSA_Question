package Ch4_String;

public class LowerCase {
    public static String lowerCase(String s)
    {
        String str =" ";
        for(int i=0; i<=s.length(); i++)
        {
            char c = s.charAt(i);
            if(c>='A' && c<='Z')
            {
            str = str+(char)(c+32);
            }
            else
            {
                str= str+c;
            }
        }
        return str;
    }
    public static void main(String[] args) {
        String str = "Hello";
        String s = lowerCase(str);
        System.out.println(s);
    }
}
