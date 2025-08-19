package Ch4_String;

public class Concatenation {
    public static void main(String[] args) {
        String s1 = "JAVA";
        String s2 = "Python";
        System.out.println(s1);
        System.out.println(s2);

        String s3 = "JAVA" + "Python";
        String s4 = "JAVA" + "Python";
        if (s3 == s4) {
            System.out.println("Ref is equal");
        } else {
            System.out.println("Ref is not equal");
        }

        if (s3.equals(s4)) {
            System.out.println("Value is equal");
        } else {
            System.out.println("Value is not equal");
        }

        System.out.println("<................................................>");
        String str1 = "JAVA";
        String str2 = "Python";
        System.out.println(str1);
        System.out.println(str2);

        String str3 = str1 + str2;
        String str4 = str1 + str2;
        if (str3 == str4) {
            System.out.println("Ref is equal");
        } else {
            System.out.println("Ref is not equal");
        }

        if (str3.equals(str4)) {
            System.out.println("Value is equal");
        } else {
            System.out.println("Value is not equal");
        }

    }
}
