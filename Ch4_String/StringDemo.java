package Ch4_String;

public class StringDemo {
    public static void main(String[] args) {
        
        // method-1 to creating string in java
        String s1= "Java"; // constant pool
        String s2 = "Java";
        if(s1 == s2)
        {
            System.out.println("refernces are equal");
        }
        else
        {
            System.out.println("Ref is unequal");
        }
        if(s1.equals(s2))
        {
            System.out.println("Value are equal");
        }else
        {
            System.out.println("Value are not equal");
        }

        // method-2 
        String str1 = "JAVA";
        String str2 = new String("JAVA");

        if(str1 == str2)
        {
            System.out.println("Ref is equal");
        }
        else
        {
            System.out.println("Ref is not equal");
        }

        if(str1.equals(str2))
        {
            System.out.println("Value are equal");
        }else
        {
            System.out.println("Value are not equal");
        }

        // method -3
        String st1 = new String("JAVA");
        String st2 = new String("JAVA");

         if(st1 == st2)
        {
            System.out.println("Ref is equal");
        }
        else
        {
            System.out.println("Ref is not equal");
        }

        if(st1.equals(st2))
        {
            System.out.println("Value are equal");
        }else
        {
            System.out.println("Value are not equal");
        }
        System.out.println("<-------------------------------->");

        // method -4
        String ns1 = "Java";
        String ns2= "JAVA";

         if(ns1 == ns2)
        {
            System.out.println("Ref is equal");
        }
        else
        {
            System.out.println("Ref is not equal");
        }

        if(ns1.equals(ns2))
        {
            System.out.println("Value are equal");
        }else
        {
            System.out.println("Value are not equal");
        }

        if(ns1.equalsIgnoreCase(str2))
        {
            System.out.println("Value are equal");
        }
        else
        {
            System.out.println("Value are not equal ");
        }        
          System.out.println("<-------------------------------->");        
         
          // method-5
          String x = "java";
          String y = new String("JAVA");
          
    }
}
