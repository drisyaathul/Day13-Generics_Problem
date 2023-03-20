package com.bridgelabz;

public class TestMaximum <T extends Comparable <T>>{
    T a,b,c,d,e,f;

    public TestMaximum(T a, T b, T c, T d, T e, T f){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;

    }
    static <T extends Comparable <T>> T maximumValue(T a, T b, T c, T d, T e, T f){

        T max = a;
        if (b.compareTo(max) > 0)
            max = b;
        if (c.compareTo(max) > 0)
            max = c;
        if (d.compareTo(max) > 0)
            max = d;
        if (e.compareTo(max) > 0)
            max = e;
        if (f.compareTo(max) > 0)
            max = f;

        return max;
    }
    public static void main(String[] args) {
        System.out.println("*** Welcome to Generics Problem ***");

        System.out.println("The Maximum Value in Integers : "+maximumValue(20, 80, 90, 50,40, 75));
        System.out.println("The Maximum Value in Floats : "+maximumValue(7.29f, 3.10f, 9.23f, 9.9f, 2.8f, 4.7f));
        System.out.println("The Maximum Value in Strings : "+maximumValue("Apple","Peach","Banana","Orange","WaterMelon","Grapes"));

    }
}
