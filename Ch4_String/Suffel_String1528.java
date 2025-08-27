package Ch4_String;

public class Suffel_String1528 {
    public static String restoreString(String s, int[] index)
    {
       char res[] = new char[s.length()];

       for(int i=0; i<s.length(); i++)
       {
         res[index[i]] = s.charAt(i);
       }
        return new String(res);  // convert array back to string
    }
    public static void main(String[] args) {
        String s = "dcba";
        int index[] = {3,2,1,0};

        String ans = restoreString(s, index);
        System.out.println(ans);
        
    }
}
