package KatasAll;
//import java.io.*;
import java.util.*;

public class Kata1 {
    public static int solution(int number) {
        Vector<Integer> vResult = new Vector<>();

        for (int i = 1; i <= number; i++)  {
            if (i * 3 < number && !vResult.contains(i *3)) vResult.addElement(i * 3);

            System.out.println("i * 5 = " + i * 5);
            System.out.println(vResult.contains(i *5));
            if (i * 5 < number && !vResult.contains(i *5)) vResult.addElement(i * 5);

        }
        System.out.println(vResult);
        return vResult.stream().mapToInt(Integer::valueOf).sum();

    }

}
