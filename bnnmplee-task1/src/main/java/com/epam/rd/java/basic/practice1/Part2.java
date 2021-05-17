package com.epam.rd.java.basic.practice1;

public class Part2 {

    public static void main(String[] args) {
        if (args.length > 0) {
            int sum = 0;
            for (String arg : args) {
                if (isNumber(arg)) {
                    sum += Integer.parseInt(arg);
                } else {
                    System.out.println(" not a number!");
                }
            }
            System.out.print(sum);
        } else
            System.out.println("No input data!");
    }

    private static boolean isNumber(String arg) {
        try {
            Integer.parseInt(arg);
            return true;
        } catch (NumberFormatException ne) {
            System.out.print("Error! " + ne.getMessage());
            return false;
        }
    }
}
