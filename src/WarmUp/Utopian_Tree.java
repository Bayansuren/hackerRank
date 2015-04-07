package WarmUp;

import java.util.Scanner;

public class Utopian_Tree {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		int tree = 1;
		n = scan.nextInt();
		int[] cycle = new int[n];
		for (int i = 0; i < n; i++) {
			cycle[i] = scan.nextInt();
		}

		for (int i = 0; i < cycle.length; i++) {
			tree = 1;
			int temp = 2;
			for (int j = 0; j < cycle[i]; j++) {
				if (temp % 2 == 0) {
					tree = tree * 2;
				} else {
					tree = tree + 1;
				}

				temp++;
			}
			System.out.println(tree);
		}
	}

}
