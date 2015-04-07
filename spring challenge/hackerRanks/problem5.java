package hackerRanks;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class problem5 {

	public static void main(String[] args) {
		int m, n, counter = 2;
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		m = scan.nextInt();
		ArrayList<Integer> types = new ArrayList();
		int[][] matrix = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				matrix[i][j] = scan.nextInt();
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (matrix[i][j] == 1) {
					types.add(counter);
					fill(matrix, n, m, i, j, counter++);
				}
			}
		}

		int tempVal = 0;
		int tempMax = 0;
		int temp = 0;
		for (int i = 0; i < types.size(); i++) {
			temp = (int) types.get(i);
			tempVal = countResult(matrix, n, m, temp);
			if (tempVal > tempMax) {
				temp = tempVal;
				tempVal = tempMax;
				tempMax = temp;
			}
		}
		System.out.println(tempMax);

	}

	public static void fill(int[][] matrix, int n, int m, int i, int j,
			int counter) {
		if (j < m - 1) // hevtee baruun tiishee
			if ((matrix[i][j] == 1 && matrix[i][j + 1] == 1)
					|| (matrix[i][j] == counter && matrix[i][j + 1] == 1)) {
				checkHorizontalRight(matrix, i, j, m, counter);
				fill(matrix, n, m, i, j + 1, counter);
			}

		if (j != 0) // hevtee zuun tiishee
			if ((matrix[i][j] == 1 && matrix[i][j - 1] == 1)
					|| (matrix[i][j] == counter && matrix[i][j - 1] == 1)) {
				checkHorizontalLeft(matrix, i, j, m, counter);
				fill(matrix, n, m, i, j - 1, counter);
			}

		if (i < n - 1) // bosoo dooshoo
			if ((matrix[i][j] == 1 && matrix[i + 1][j] == 1)
					|| (matrix[i][j] == counter && matrix[i + 1][j] == 1)) {
				checkVerticalDown(matrix, i, j, n, counter);
				fill(matrix, n, m, i + 1, j, counter);
			}

		if (i != 0) // bosoo deeshee
			if ((matrix[i][j] == 1 && matrix[i - 1][j] == 1)
					|| (matrix[i][j] == counter && matrix[i - 1][j] == 1)) {
				checkVerticalUp(matrix, i, j, n, counter);
				fill(matrix, n, m, i - 1, j, counter);
			}

		if (i < n - 1 && j != 0) // Zuun dooshoo diagnol
			if ((matrix[i][j] == 1 && matrix[i + 1][j - 1] == 1)
					|| (matrix[i][j] == counter && matrix[i + 1][j - 1] == 1)) {
				checkDiagnolDownLeft(matrix, i, j, n, m, counter);
				fill(matrix, n, m, i + 1, j - 1, counter);
			}

		if (i < n - 1 && j < m - 1) // Baruun dooshoo diagnol
			if ((matrix[i][j] == 1 && matrix[i + 1][j + 1] == 1)
					|| (matrix[i][j] == counter && matrix[i + 1][j + 1] == 1)) {
				checkDiagnolDownRight(matrix, i, j, n, m, counter);
				fill(matrix, n, m, i + 1, j + 1, counter);
			}

		if (i != 0 && j != 0 && j < m - 1) // Baruun deeshee diagnol
			if ((matrix[i][j] == 1 && matrix[i - 1][j + 1] == 1)
					|| (matrix[i][j] == counter && matrix[i - 1][j + 1] == 1)) {
				checkDiagnolUpRight(matrix, i, j, n, m, counter);
				fill(matrix, n, m, i - 1, j + 1, counter);
			}

		if (i != 0 && j != 0) // Zuun deeshee diagnol
			if ((matrix[i][j] == 1 && matrix[i - 1][j - 1] == 1)
					|| (matrix[i][j] == counter && matrix[i - 1][j - 1] == 1)) {
				checkDiagnolUpLeft(matrix, i, j, n, m, counter);
				fill(matrix, n, m, i - 1, j - 1, counter);
			}
	}

	public static void checkDiagnolUpLeft(int[][] matrix, int i, int j, int n,
			int m, int counter) {
		matrix[i][j] = counter;
		matrix[i - 1][j - 1] = counter;
	}

	public static void checkDiagnolUpRight(int[][] matrix, int i, int j, int n,
			int m, int counter) {
		matrix[i][j] = counter;
		matrix[i - 1][j + 1] = counter;
	}

	public static void checkDiagnolDownRight(int[][] matrix, int i, int j,
			int n, int m, int counter) {
		matrix[i][j] = counter;
		matrix[i + 1][j + 1] = counter;
	}

	public static void checkDiagnolDownLeft(int[][] matrix, int i, int j,
			int n, int m, int counter) {
		matrix[i][j] = counter;
		matrix[i + 1][j - 1] = counter;
	}

	public static void checkVerticalDown(int[][] matrix, int i, int j, int n,
			int counter) {
		matrix[i][j] = counter;
		matrix[i + 1][j] = counter;
	}

	public static void checkVerticalUp(int[][] matrix, int i, int j, int n,
			int counter) {
		matrix[i][j] = counter;
		matrix[i - 1][j] = counter;
	}

	public static void checkHorizontalLeft(int[][] matrix, int i, int j, int m,
			int counter) {
		matrix[i][j] = counter;
		matrix[i][j - 1] = counter;
	}

	public static void checkHorizontalRight(int[][] matrix, int i, int j,
			int m, int counter) {
		matrix[i][j] = counter;
		matrix[i][j + 1] = counter;
	}

	public static void showMatrix(int[][] matrix, int n, int m) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static int countResult(int[][] matrix, int n, int m, int val) {
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (matrix[i][j] == val)
					count++;
			}
		}
		return count;
	}
}
