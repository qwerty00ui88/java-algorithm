package section08.quiz02;

import java.util.Scanner;

//259 5
//81
//58
//42
//33
//61
public class Main {
	static int answer = 0;
	static int c, n;

	public void DFS(int L, int sum, int[] arr) {
		if (sum > c) {
			return;
		}

		if (L == n) {
			if (sum > answer) {
				answer = sum;
			}
		} else {
			DFS(L + 1, sum + arr[L], arr);
			DFS(L + 1, sum, arr);
		}
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		c = kb.nextInt();
		n = kb.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}
		T.DFS(0, 0, arr);
		System.out.print(answer);
	}
}
