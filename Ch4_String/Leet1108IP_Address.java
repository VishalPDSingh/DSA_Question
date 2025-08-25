package Ch4_String;

import java.util.Scanner;

public class Leet1108IP_Address {
    public static String defangIPaddr(String address) 
    {
        
        address =  address.replace(".", "[.]");    
        return address;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the address");
        String str = sc.nextLine();
        String ans = defangIPaddr(str);
        System.out.println(ans);
        sc.close();

    }
}
