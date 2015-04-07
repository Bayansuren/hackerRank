package WarmUp;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Game_Of_Thrones_1 {

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		ArrayList<Character> chars = new ArrayList<Character>();
		for (char c : str.toCharArray()) {
			chars.add(c);
		}
		int check = 0;
		for (int i = 0; i < chars.size() - 1; i++) {
			int count = 1;
			for (int j = i + 1; j < chars.size(); j++) {
				if(chars.get(i).equals(chars.get(j))){
					count++;
					chars.remove(j);
					j--;
				}
			}
			if(count % 2 != 0){
				check++;
			}
			if(check == 2){
				break;
			}
		}
		if(check == 2){
			System.out.println("NO");
		}
		else
			System.out.println("YES");
	}
}
