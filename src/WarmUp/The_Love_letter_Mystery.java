package WarmUp;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class The_Love_letter_Mystery {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		n = scan.nextInt();
		String[] cycle = new String[n];
		for (int i = 0; i < n; i++) {
			cycle[i] = scan.next();
		}

		for (int i = 0; i < n; i++) {
			System.out.println(polimdrom(cycle[i]));
		}

	}

	public static int polimdrom(String word) {
		int count = 0;
		int length = word.length();
		for (int i = 0; i < length / 2; i++) {
			if (word.charAt(i) == word.charAt(length - i - 1)) {
				continue;
			} else if ((int) word.charAt(i) < (int) word.charAt(length - i - 1)) {
				count = count + (int) word.charAt(length - i - 1)
						- (int) word.charAt(i);
			} else if ((int) word.charAt(i) > (int) word.charAt(length - i - 1)) {
				count = count + (int) word.charAt(i)
						- (int) word.charAt(length - i - 1);
			}
		}
		return count;
	}

}
