package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!2");
        boolean result = isPalindrome(-1221);
        System.out.println(result);
  }
    public static boolean isPalindrome(int number) {
       int newNumber = Math.abs(number);
        String numberString = String.valueOf(newNumber);
        String palindromeNumber = new StringBuilder(numberString).reverse().toString();

        if (numberString.equals(palindromeNumber)) {
            return true;
        } else {
            return false;
        }
    };


    public static boolean isPerfectNumber(int number) {
        int result = 0;

        for (int i=1; i < number; i++) {
            if (number % i == 0) {
                result += i;
            }
        }
        return  result == number;
    };

    public static String numberToWords(int number) {

        if (number < 0) {
            return "Invalid Value";
        }

        String[] words = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};

        ArrayList<String> result = new ArrayList<>();

        while (number > 0) {
            int sonRakam = number % 10;
            result.add(0,words[sonRakam]);
            number = number / 10;
        }

        return String.join(" ", result);
    }
}
