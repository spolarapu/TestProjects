package Streams;

import java.util.Arrays;
import java.util.stream.Collectors;

public  class Sample {

    public static void main(String k[]){


        String s = Arrays.stream("abc, def, ghi, jkl, mno".split(", ")).filter(a->a.equals("abc")).collect(Collectors.joining());
        System.out.println(s);



         //Arrays.stream("abc, def, ghi, jkl, mno".split(", ")).filter(a->a.equals("abc")).
    }
}
