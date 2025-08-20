package Ch4_String;

public class ConCat_Method {
    public static void main(String[] args) {

        String s1 = "JAVA";
        String s2 = "Python";
        System.out.println(s1);
        System.out.println(s2);

        // String s3 = s1.concat(s2);
        String s3 = "JAVA".concat("Python");
        String s4 = "JAVA".concat("Python");
        // String s4 = s1.concat(s2);

        if (s3 == s4) {
            System.out.println("Ref is equal");
        } else {
            System.out.println("Ref is not equal");
        }
        if(s3.equals(s4))
        {
            System.out.println("value is equal");
        }
        else
        {
            System.out.println("Values are not equal");
        }
    }
}
