package Ch4_String;

public class Q4_charArray {
    public static char[] charArray(String str)
    {
        char ch[] = new char[str.length()];

        for(int i=0; i<str.length(); i++)
        {
            char c = str.charAt(i);
            ch[i] = c;
        }
        return ch;
    }
    
    public static void main(String[] args) {
        String str = "vishal";

        char ans[] = charArray(str);
        for(char res:ans)
        {
            System.out.print(res+ " ");
        }
        System.out.println(ans.length);
    }
}
