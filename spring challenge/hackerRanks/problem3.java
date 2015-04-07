package hackerRanks;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class problem3 {
	static int sumDig(int n) {
		int s = 0;
		while (n > 0) {
			s = s + n % 10;
			n = n / 10;
		}
		return s;
	}

	static int sumPrimeFact(int n) {
		int i = 2, sum = 0;
		while (n > 1) {
			if (n % i == 0) {
				sum = sum + sumDig(i);
				n = n / i;
			} else
				i++;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N;
		N = in.nextInt();
		int a = sumDig(N);
		int b = sumPrimeFact(N);
		if (a == b)
			System.out.print(1);
		else
			System.out.print(0);
	}

}
