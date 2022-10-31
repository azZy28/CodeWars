package KatasAll;

//https://www.codewars.com/kata/525f4206b73515bffb000b21/java

//import java.math.BigInteger;

import com.sun.source.tree.WhileLoopTree;

public class Kata3 {

    public static String clear (String toClear) {
        while ((int)(toClear.charAt(0) - '0') == 0) toClear = toClear.substring(1, toClear.length());
        return toClear;
    }

    public static String add (String a, String b) {

        //make sure first str is less
        if (a.length() > b.length()) {
            String new1 = b;
            b = a;
            a = new1;
        }

        String result = "";
        a = clear(a);
        b = clear(b);
        int carry = 0;
        int lengthA = a.length();
        int lengthB = b.length();
        int diff = lengthB - lengthA;

        for (int i = lengthA-1; i >= 0; i-- ) {
            int sum = (int)((a.charAt(i)) - '0') + (int)((b.charAt(i+diff)) - '0') + carry;
            result += (char)(sum % 10 + '0');
            carry = sum / 10;
            //System.out.println((int)(a.charAt(i)) + "....." + (int)(b.charAt(i+diff)));
            //System.out.println(sum);
        }

        for (int i = diff-1; i >= 0; i--) {
            int sum = (int)((b.charAt(i) - '0')) + carry;
            result += (char)(sum % 10 + '0');
            carry = sum / 10;
        }

        if (carry > 0) result += (char)(carry + '0');

        return new StringBuilder(result).reverse().toString();

    }
}
