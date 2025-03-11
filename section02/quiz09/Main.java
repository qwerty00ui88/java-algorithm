package section02.quiz09;

import java.util.Scanner;

public class Main {
	public int solution(int n, int[][] arr) {
		int answer = Integer.MIN_VALUE;
		int sum3 = 0, sum4 = 0;
		for (int i = 0; i < n; i++) {
			int sum1 = 0, sum2 = 0;
			for (int j = 0; j < n; j++) {
				sum1 += arr[i][j];
				sum2 += arr[j][i];
				if (i == j) {
					sum3 += arr[i][j];
				}
				if (i + j == n) {
					sum4 += arr[i][j];
				}
			}
			answer = Math.max(answer, sum1);
			answer = Math.max(answer, sum2);
		}
		answer = Math.max(answer, sum3);
		answer = Math.max(answer, sum4);
		return answer;
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[][] arr = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = kb.nextInt();
			}
		}
		System.out.print(T.solution(n, arr));
	}
}