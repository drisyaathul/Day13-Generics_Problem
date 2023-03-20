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
    public static void main(String[] args) {
        System.out.println("*** Welcome to Generics Problem ***");

        findMaximumValue(20,80,60);
    }
}
