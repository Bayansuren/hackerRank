package hackerRanks;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class problem2 {

	public static void main(String[] args) {
		Boolean status = false;
		Scanner in = new Scanner(System.in);
		int p, q;
		p = in.nextInt();
		q = in.nextInt();
		if ((0 < p && p >= 100000) || (0 < q && q >= 100000) || p > q) {
			System.out.println("INVALID RANGE");
		} else {
			for (int i = p; i <= q; i++) {
				if (isKaprekar(i)) {
					System.out.print(i + " ");
					status = true;
				}
			}
		}
		if (status == false) {
			System.out.println("INVALID RANGE");
		}
	}

	public static boolean isKaprekar(int n) {
		int n2, l, p1, p2;
		n2 = n * n;
		l = ("" + n).length();
		p1 = n2 % (int) Math.pow(10, l);
		p2 = n2 / (int) Math.pow(10, l);
		if ((p1 + p2) == n)
			return true;
		return false;
	}

}
