/**
 * File Name: Problem Set Unit 5
 * Author: Tom Leung
 * Date Created: May 12, 2026
 * Date Last Edited: May 12, 2026
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.ArrayDeque;

public class ProblemSet {

	public static void main(String args[]) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Welcome to the Text Analyzer.\n");
		System.out.println("Please enter a sentence or paragraph: ");
		String input = ip.nextLine();
		int chara = input.length();
		String input1 = input.trim();
		String input2 = input1.toLowerCase();
		int count = 0;
		int count1 = 0;
		for (int i = 0; i < input1.length(); i ++){
			if (input1.charAt(i) == ' '){
				count ++;
			}
			else if (input2.charAt(i) == 'a' || input2.charAt(i) == 'e' || input2.charAt(i) == 'i' || input2.charAt(i) == 'o' || input2.charAt(i) == 'u'){
				count1 ++;
			}
		}
		int words = count + 1;
		int vowels = count1;
		int spaces = count;

		System.out.println("\nTotal Characters: " + chara);
		System.out.println("Total Words: " + words);
		System.out.println("Total Vowels: " + vowels);
		System.out.println("Total Spaces: " + spaces);
	}

}
