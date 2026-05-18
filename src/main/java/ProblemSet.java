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
		String input1 = input.trim();
		String input2 = input1.toLowerCase();
		while(input2.contains("  ")){
			 input2 = input2.replaceAll("  "," ");
		}

		System.out.println(input2);
		int chara = input.length();
		int count = 0;
		int count1 = 0;
		
		String split = "[^a-zA-Z0-9'@#$%]+";
		ArrayList <String> wordarr = new ArrayList<String>(Arrays.asList(input2.split(split)));
		System.out.println(wordarr);
		for (int i = wordarr.size() - 1; i >= 0; i--) {

            String word = wordarr.get(i);
			
			// remove empty elements and remove symbols-only words like @#$%
            if (word.isEmpty() || word.replaceAll("[@#$%']+", "").isEmpty()) {
				wordarr.remove(i);
            }
        }
		System.out.println(wordarr);
		ArrayList <String> wordarr1 = new ArrayList<String>();
		for (int i1=0;i1<wordarr.size();i1++){
			if (wordarr.get(i1) != "" && wordarr.get(i1).replaceAll("['@#$%]+","") == "" ){
				wordarr1.add(wordarr.get(i1));
			}
		}
		for (int i = 0; i < input.length();i++){
			if (input.charAt(i) == ' '){
				count++;
			}

			if (input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o' || input.charAt(i) == 'u'){
				count1 ++;
			}
		}
			
		int words = wordarr1.size();
		int vowels = count1;
		int spaces = count;

		System.out.println("\nTotal Characters: " + chara);
		System.out.println("Total Words: " + words);
		System.out.println("Total Vowels: " + vowels);
		System.out.println("Total Spaces: " + spaces);
		
		System.out.println(wordarr1);

		HashMap<String, Integer> fre = new HashMap<String, Integer>();
		for (int i = 0;i<wordarr1.size();i++){
			if (!fre.isEmpty() && fre.containsKey(wordarr1.get(i))){
				fre.put(wordarr1.get(i),fre.get(wordarr1.get(i))+1);
			}
			else {
				fre.put(wordarr1.get(i), 1);
			}
		}

		System.out.println(fre);
		System.out.println("Word Frequency:");
		for (String key: fre.keySet()){
			if (key != "the" && key != "a" && key != "an" && key != "and" && key != "is" ){
				System.out.println(key + "-" + fre.get(key));
			}
			
		}
	}

}
