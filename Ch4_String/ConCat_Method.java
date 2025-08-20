package Ch4_String;

public class ConCat_Method {
    public static void main(String[] args) {
        
        String s1 = "JAVA";
        String s2 = "Python";

    //    String s3 = s1.concat(s2);
       String s3 = "JAVA".concat("Python");
        String s4 = "JAVA".concat("Python");
       // String s4 = s1.concat(s2);

        if (s3 == s4) {
            System.out.println("Ref is equal");
        } else {
            System.out.println("Ref is not equal");
        }
    }
}
