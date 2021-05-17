package com.epam.rd.java.basic.practice1;

public class Part4 {

    public static void main(String[] args) {
        try {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            System.out.print(gcd(a, b));
        } catch (NullPointerException e){
            e.getMessage();
        }
    }

    private static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
