package com.palindrome;

import java.util.Scanner;

public class PalindromeChecker {
	public static void main(String[] args) {
		System.out.print("Welcome to the Palindrome checker App\n\n");
		while (true) {

			System.out.println(" ***** Menu ***** \n");
			System.out.println("1.Palindrome checker App");
			System.out.print("2.Exit\n");
			String input = getInput();
			if (input.equals("1")) {
				String inputStr = getInput();
				if (isPalindrome2(inputStr)) {
					System.out.println(inputStr + " is a palindrome");
				} else {
					System.out.println(inputStr + " is not a palindrome");
				}

			} else if (input.equals("2")) {
				System.out.print("App exited");
				break;

			} else {
				System.out.println("Invalid input");
			}
		}

	}

	public static String getInput() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("\n Enter the input: ");
		String input = scanner.nextLine();
		input = input.toLowerCase();
		return input;

	}

	public static boolean isPalindrome2(String str1) {

		String input = "";
		for (int i = str1.length() - 1; i >= 0; i--) {
			input = input + str1.charAt(i);

		}

		if (input.equals(str1)) {
			return true;
		}

		return false;

	}


}
