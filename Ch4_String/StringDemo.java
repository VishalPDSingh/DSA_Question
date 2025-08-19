package Ch4_String;

public class StringDemo {
    public static void main(String[] args) {

        // method 1
        String s1 = "JAVA";
        String s2 = "JAVA";
        if (s1 == s2) {
            System.out.println("Ref is equal");
        } else {
            System.out.println("Ref is not equal");
        }
        if (s1.equals(s2)) {
            System.out.println("Value are equal");
        } else {
            System.out.println("Not Equal");
        }
        System.out.println("<................................................>");

        // Method 2
        String str1 = "JAVA";
        String str2 = new String("JAVA");
        if (str1 == str2) {
            System.out.println("Ref is equal");
        } else {
            System.out.println("Ref is not equal ");
        }
        if (str1.equals(str2)) {
            System.out.println("Value are equal");
        } else {
            System.out.println("Value are not equal");
        }
        System.out.println("<................................................>");

        // method 3
        String name1 = "java";
        String name2 = "JAVA";

        if (name1 == name2) {
            System.out.println("Ref is equal");
        } else {
            System.out.println("Ref is not equal ");
        }
        if (name1.equals(name2)) {
            System.out.println("Value are equal");
        } else {
            System.out.println("Value are not equal");
        }
        System.out.println("<................................................>");

        // method 4
        String naam1 = new String("JAVA");
        String naam2 = new String("JAVA");

        if (naam1 == naam2) {
            System.out.println("Ref is equal");
        } else {
            System.out.println("Ref is not equal ");
        }
        if (naam1.equals(naam2)) {
            System.out.println("Value are equal");
        } else {
            System.out.println("Value are not equal");
        }

        if (s1.equalsIgnoreCase(str2)) {
            System.out.println("Value are  equal");
        } else {
            System.out.println("Value are not equal");
        }
        System.out.println("<................................................>");

        // method 5
        String x = new String("Java");
        String y = new String("JAVA");

        if (x == y) {
            System.out.println("Ref is equal");
        } else {
            System.out.println("Ref is not equal ");
        }
        if (x.equals(y)) {
            System.out.println("Value are equal");
        } else {
            System.out.println("Value are not equal");
        }

        if (x.equalsIgnoreCase(y)) {
            System.out.println("Value are  equal");
        } else {
            System.out.println("Value are not equal");
        }
        System.out.println("<................................................>");
    }
}
