package com.epam.rd.java.basic.practice1;

public class Part3 {

    public static void main(String[] args) {
        try {
            StringBuilder sb = new StringBuilder();
            for(String arg : args){
                sb.append(arg).append(" ");
            }
            System.out.print(sb.toString().trim());
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.print("No input data");
        }

    }
	
}
