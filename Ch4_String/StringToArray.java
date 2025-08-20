package Ch4_String;

import java.util.Scanner;

public class StringToArray {
    public static char[] array(String str) {
        char arr[] = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }
        System.out.println(arr.length);
        return arr;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of String: ");
        String str = sc.nextLine();
        System.out.println(array(str));

        System.out.println();
      //  built in method
        String str1 = "java";
        System.out.println(str1.toCharArray());
        System.out.println(str1.toCharArray().length);

        sc.close();
    }
}
