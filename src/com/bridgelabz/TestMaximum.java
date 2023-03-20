package com.bridgelabz;

public class TestMaximum {
    //find the maximum of three Integer
    public static void findMaximumValue(Integer a, Integer b, Integer c){

        Integer max = a;
        if (b.compareTo(max) > 0)
            max = b;
        if (c.compareTo(max) > 0)
            max = c;
        System.out.println("The Maximum of Three Integers (" + a + ","+ b +","+ c +") is "+max );
    }

    public static void findMaximumValue(Float d, Float e, Float f){
        Float max = d;
        if (e.compareTo(max) > 0)
            max = e;
        if (f.compareTo(max) > 0)
            max = f;
        System.out.println("The Maximum of Three Floats (" + d + ", " + e + ", " + f + ") is " +max);
    }

    public static void findMaximumValue(String x, String y, String z){
        String max = x;
        if (y.compareTo(max) > 0)
            max = y;
        if (z.compareTo(max) > 0)
            max = z;
        System.out.println("The Maximum of Three Strings (" + x + ", " + y + ", " + z + ") is " +max);
    }
    public static void main(String[] args) {
        System.out.println("*** Welcome to Generics Problem ***");

        findMaximumValue(20,80,60);
        findMaximumValue(7.29f,3.10f,9.23f);
        findMaximumValue("Apple","Peach","Banana");

    }
}
