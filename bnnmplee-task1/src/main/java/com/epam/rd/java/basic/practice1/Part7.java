package com.epam.rd.java.basic.practice1;



public class Part7 {
    private static final char[] ALPHABET = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O',
            'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    private static final int MAX_VAL = 26;

    public static void main(String[] args) {
        System.out.println("A ==> 1 ==> A");
        System.out.println("B ==> 2 ==> B");
        System.out.println("Z ==> 26 ==> Z");
        System.out.println("AA ==> 27 ==> AA");
        System.out.println("AZ ==> 52 ==> AZ");
        System.out.println("BA ==> 53 ==> BA");
        System.out.println("ZZ ==> 702 ==> ZZ");
        System.out.println("AAA ==> 703 ==> AAA");

        try {
            for (String arg : args) {
                System.out.println(arg + " ==> " + str2int(arg) + " ==> " + int2str(str2int(arg)));
            }
        } catch (NullPointerException e) {
            e.getMessage();
        }
    }

    public static int str2int(String number) {
        int result = 0;
        if (number.length() > 1) {
            for (int i = 0; i < number.length(); i++) {
                result += raiseToPower(MAX_VAL, (number.length() - (1 + i))) * getLetterPosition(number.charAt(i));
            }
        } else {
            result = getLetterPosition(number.charAt(number.length() - 1));
        }
        return result;
    }

    private static int getLetterPosition(char letter) {
        for (int i = 0; i < ALPHABET.length; i++) {
            if (ALPHABET[i] == letter) {
                return i + 1;
            }
        }
        return 0;
    }

    private static int raiseToPower(int base, int exponent) {
        int powerBase = 1;
        for (int i = 0; i < (exponent < 0 ? -exponent : exponent); i++) {
            powerBase = powerBase * base;
        }
        return powerBase;
    }

    public static String int2str(int number) {
        int position;
        char[] letters = new char[findLength(number)];
        if (number > MAX_VAL) {
            int i = 0;
            while (number > 0) {
                i++;
                position = getPosition(number);
                if (position == MAX_VAL) {
                    number = (number / MAX_VAL) - 1;
                } else {
                    number /= MAX_VAL;
                }
                letters[letters.length - i] = ALPHABET[position - 1];
            }
        } else if (number == 0) {
            System.out.print("Error data!!");
        } else {
            letters[0] = ALPHABET[number - 1];
        }
        return toString(letters);
    }

    private static int getPosition(int number) {
        int result = number % 26;
        if (result == 0) {
            return MAX_VAL;
        }
        return result;
    }

    private static String toString(char[] letters) {
        StringBuilder sb = new StringBuilder();
        for (Character letter : letters) {
            sb.append(letter);
        }
        return sb.toString();
    }

    private static int findLength(int number) {
        int i = 0;
        if (number > MAX_VAL) {
            while (number > 0) {
                number /= MAX_VAL;
                i++;
            }
            return i;
        } else {
            return 1;
        }
    }

    public static String rightColumn(String number) {
        return int2str(str2int(number) + 1);
    }
}
