package section08.quiz04;

import java.util.Scanner;

public class Main {
	static int[] arr;
	static int n, m;

	public void DFS(int L) {
		if (L == m) {
			for (int i : arr) {
				System.out.print(i + " ");
			}
			System.out.println();
			return;
		} else {
			for (int i = 1; i <= n; i++) {
				arr[L] = i;
				DFS(L + 1);
			}
		}
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		m = kb.nextInt();
		arr = new int[m];
		T.DFS(0);
	}
}
