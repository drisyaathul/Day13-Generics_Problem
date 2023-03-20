package com.bridgelabz;

public class TestMaximum {
    //find the maximum value by One Generic Method:
    static <T extends Comparable <T>> T maximumValue(T a, T b, T c){

        T max = a;
        if (b.compareTo(max) > 0)
        max = b;
        if (c.compareTo(max) > 0)
        max = c;
        return max;
    }
    public static void main(String[] args) {
        System.out.println("*** Welcome to Generics Problem ***");

        System.out.println("The Maximum Value in Three Integers : "+maximumValue(20, 80, 60));
        System.out.println("The Maximum Value in Three Floats : "+maximumValue(7.29f, 3.10f, 9.23f));
        System.out.println("The Maximum Value in Three Strings : "+maximumValue("Apple", "Peach", "Banana"));

    }
}
