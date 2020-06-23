package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Please enter a String");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        isPalindrome(string);
    }

    private static boolean isPalindrome(String string) {
        int i = 0;
        int j = string.length() - 1;
        while (i < j) {
            if (string.charAt(i) != string.charAt(j)) {
                System.out.println("This string is not palindrome");
                return false;
            } else {
                i++;
                j--;
            }
        }
        System.out.println("This string is palindrome");
        return true;
    }
}

//Palindrome in pseudocode

//Citeste String;
//i <- primul caracter din String; j <- ultimul caracter din String;
//
//Cat timp i < j
//    - daca i nu este egal cu j - afiseaza "String-ul nu este palindrome";
//    sfarsit cat timp;
//
//    - daca i este egal cu j
//    atunci i = i + 1, j = j - 1
//    citeste noile valori ale lui i si j
//    afiseaza "String-ul este palindrome"
//    sfarsit cat timp;



