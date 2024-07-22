package Hash;

import java.util.HashMap;
public class Hash_Code {
    public static void main(String[] args) {
        String name = "Gourav";

        Integer num = 123456;

        int scode = name.hashCode();
        System.out.println(scode);

        int ncode = num.hashCode();
        System.out.println(ncode);

       String naam = "Gourav";  // for a String hashCode give a fixed integer.
       System.out.println(naam.hashCode());





    }



}
