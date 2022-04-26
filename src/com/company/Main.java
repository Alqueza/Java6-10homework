package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(method1(1,20,34,123,435,12,1));
    }

    static boolean method1(int a, int... varargs) {
        for (int i = 0; i < varargs.length; i++) {
            System.out.println(varargs[i]);

            if (a == varargs[i]) {
                return true;
            }
        }
        return false;
    }
}