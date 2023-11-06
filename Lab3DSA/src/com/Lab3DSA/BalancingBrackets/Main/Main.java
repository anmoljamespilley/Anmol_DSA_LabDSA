package com.Lab3DSA.BalancingBrackets.Main;

import java.util.Scanner;

import com.Lab3DSA.BalancingBrackets.Functions.BracketChecker;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string with brackets: ");
        String input = scanner.nextLine();
        scanner.close();

        if (BracketChecker.isBalanced(input)) {
            System.out.println("the entered string has balanced brackets");
        } else {
            System.out.println("the entered string do not contain balanced brackets");
        }
    }
}
