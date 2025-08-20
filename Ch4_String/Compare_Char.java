package Ch4_String;

public class Compare_Char {
    public static void main(String[] args) {
        // case1
        String s1 = "Java";
        String s2 = "Javac";
        int res = s1.compareTo(s2);

        if(res==0)
        {
            System.out.println("Equal");
        }
        else if(res < 0)
        {
            System.out.println("s1 < s2");
        }else
        {
            System.out.println("s1>s2");
        }

        String s = "JAVA";
        System.out.println(s.charAt(2));
        
        String str1 = "JAVA";
        System.out.println(str1);

        str1 = str1.concat("Python");
        System.out.println(str1);

    }
}
