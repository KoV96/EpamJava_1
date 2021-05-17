package com.epam.rd.java.basic.practice1;

public class Part6 {

    public static void main(String[] args) {
        if (args.length != 0 && Integer.parseInt(args[0]) != 0) {
            int inputNum = Integer.parseInt(args[0]);
            int[] primeNumbers = new int[inputNum];
            int i = 2;
            int position = 0;
            while (position <= primeNumbers.length - 1){
                boolean isPrime = i >= 2;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    primeNumbers[position] = i;
                    position++;
                }
                i++;
            }
            printArray(primeNumbers);
        }
    }

    private static void printArray(int[] primeNumbers) {
        if (primeNumbers.length == 1){
            System.out.print(primeNumbers[0]);
        } else {
            StringBuilder sb = new StringBuilder();
            for (Integer prime : primeNumbers){
                sb.append(prime).append(" ");
            }
            System.out.print(sb.toString().trim());
        }

    }
}
