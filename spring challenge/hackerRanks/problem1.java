package hackerRanks;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class problem1 {

	public static void main(String[] args) {
		String pi = "31415926535897932384626433833";
		Scanner scanT = new Scanner(System.in);
		int t = scanT.nextInt();
		scanT.nextLine();
		int[] result = new int[t];
		for (int i = 0; i < t; i++) {
			Boolean check = true;
			String value = scanT.nextLine();
			int counterPiNumber = 0;
			String[] words = value.split(" ");
			for (int j = 0; j < words.length; j++) {
				int temp = Character
						.getNumericValue(pi.charAt(counterPiNumber));
				if (words[j].length() != temp) {
					check = false;
				}
				counterPiNumber++;
			}
			if(check == false){
				result[i] = 0;
			}
			else result[i] = 1;
		}
		for(int i = 0; i < t; i++){
			if(result[i] == 1){
				System.out.println("It's a pi song.");
			}else
				System.out.println("It's not a pi song.");
		}
	}
}