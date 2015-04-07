package Strings;

import java.util.Scanner;

public class Alternating_Characters {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		for (int i = 0; i < N; i++) {
			String s = scan.next();
			int j = 0;
			int count = 0;
			while (j < s.length() - 1) {
				if ((int) s.charAt(j) == (int) 'A') {
					if ((int) s.charAt(j + 1) != (int) 'B') {
						count++;
					}
				}
				else if((int) s.charAt(j) == (int) 'B') {
					if ((int) s.charAt(j + 1) != (int) 'A') {
						count++;
					}
				}
				j++;
			}
			System.out.println(count);
		}
	}

}
