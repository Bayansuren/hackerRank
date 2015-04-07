package Strings;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Pangrams {

	public static <E> void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Integer> arr = new ArrayList<Integer>();
		for (int i = 65; i <= 90; i++) {
			arr.add(i);
		}
		String panrams = scan.nextLine();
		for (int i = 0; i < panrams.length(); i++) {
			if (Character.isLowerCase(panrams.charAt(i)) == true) {
				char ch2 = (char) (panrams.charAt(i) - 32);
				if (arr.contains((int) ch2)) {
					int index = arr.indexOf((int) ch2);
					arr.remove(index);
				}
			}
			else{
				char ch2 = (char) (panrams.charAt(i));
				if (arr.contains((int) ch2)) {
					int index = arr.indexOf((int) ch2);
					arr.remove(index);
				}
			}
		}
		if(arr.isEmpty()){
			System.out.println("pangram");
		}
		else {
			System.out.println("not pangram");
		}

	}

}
