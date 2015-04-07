package hackerRanks;

import java.util.Scanner;

public class problem6 {

	public static void main(String[] args) {
		int N, K, Amount;
		Scanner in = new Scanner(System.in);
		N = in.nextInt();
		K = in.nextInt();
		int[][] matrix = new int[K][N];
		if ((1 <= N && N <= 20) && (1 <= K && K <= 10))
			for (int i = 0; i < K; i++) {
				for (int j = 0; j < N; j++) {
					matrix[i][j] = in.nextInt();
				}
			}
		else
			return;

		int min = 0;
		int sum = 0;
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < K - 1; j++) {
				if (matrix[j][i] > matrix[j + 1][i]) {
					min = matrix[j + 1][i];
				} else
					min = matrix[j][i];
			}
			sum = sum + min;
			System.out.println(sum);
		}
	}

	public static void fill(int[][] matrix, int i, int j, int n){
			for (int a = j; a < n; a++) {
				matrix[i][a] = 99;
			}
	}
	
	public static void showMatrix(int[][] matrix, int n, int k) {
		for (int i = 0; i < k; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

}
