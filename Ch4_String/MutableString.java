package Ch4_String;

import java.util.StringTokenizer;

public class MutableString {
    public static void main(String[] args) {
        // capacity of string mutable
        // StringBuffer s = new StringBuffer();
        // System.out.println(s.capacity());

        // to add anything use append method
        // s.append("Vishal singh");
        // System.out.println(s);

        // System.out.println(s.length());
        // s.append(" Muskan Singh");
        // System.out.println(s);
        // s.append("JISCE");
        // System.out.println(s.capacity());
        // System.out.println(s.length());
        // s.trimToSize();
        // System.out.println(s.capacity());
        // System.out.println(s.length());


        // String Builder
        StringBuilder s = new StringBuilder();
        System.out.println(s.capacity());

        // to add anything use append method
        s.append("Vishal singh");
        System.out.println(s);

        System.out.println(s.length());
        s.append(" Muskan Singh");
        System.out.println(s);
        s.append("JISCE");
        System.out.println(s.capacity());
        System.out.println(s.length());
        s.trimToSize();
        System.out.println(s.capacity());
        System.out.println(s.length());


        // JAVA PYTHON SQL AI
        //StringTokenizer

        StringTokenizer st = new StringTokenizer("JAVA PYTHON SQL AI","A");
        // System.out.println(st.hasMoreTokens());
        // System.out.println(st.nextToken());

        // System.out.println(st.hasMoreTokens());
        // System.out.println(st.nextToken());

        //  System.out.println(st.hasMoreTokens());
        // System.out.println(st.nextToken());

        // System.out.println(st.hasMoreTokens());
        // System.out.println(st.nextToken());
        
        while (st.hasMoreTokens()==true) {
            System.out.println(st.nextToken());
        }

        
    }
}
