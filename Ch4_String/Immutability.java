package Ch4_String;

public class Immutability {
    public static void main(String[] args) {
        
        String s = new String("java");
        s.concat("python");
        System.out.println(s);
    }
}
