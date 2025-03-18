package section08.quiz03;

import java.util.Scanner;

public class Main {
	static int n, m, answer = Integer.MIN_VALUE;

	public void DFS(int L, int scoreSum, int timeSum, int[][] arr) {
		if (timeSum > m) {
			return;
		}
		if (L == n) {
			answer = Math.max(answer, scoreSum);
		} else {
			DFS(L + 1, scoreSum + arr[L][0], timeSum + arr[L][1], arr);
			DFS(L + 1, scoreSum, timeSum, arr);
		}
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		m = kb.nextInt();
		int[][] arr = new int[n][2];
		for (int i = 0; i < n; i++) {
			arr[i][0] = kb.nextInt();
			arr[i][1] = kb.nextInt();
		}
		T.DFS(0, 0, 0, arr);
		System.out.print(answer);
	}

}
