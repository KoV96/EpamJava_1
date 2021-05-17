package com.epam.rd.java.basic.practice1;

public class Part5 {

    public static void main(String[] args) {
        try {
            char[] digits = args[0].toCharArray();
            int sum = 0;
            for (Character digit : digits){
                sum += Integer.parseInt(Character.toString(digit));
            }
            System.out.print(sum);
        } catch (NullPointerException e){
            e.getMessage();
        }
    }
}
