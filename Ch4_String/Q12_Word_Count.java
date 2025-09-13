package Ch4_String;

public class Q12_Word_Count {
    public static int wordCount(String s)
    {
        int count = 0;
        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i) == ' ')
            count++;
        }
        return count+1;
    }
    public static void main(String[] args) {
        String st = "How are you";
        
        int ans = wordCount(st);
        System.out.println(ans);
    }
}
