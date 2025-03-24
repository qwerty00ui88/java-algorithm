package section08.quiz06;

import java.util.Scanner;

public class Main {
	static int n, m;
	static int[] arr, memo, check;

	public void DFS(int L) {
		if (L == m) {
			for (int i = 0; i < m; i++) {
				System.out.print(memo[i] + " ");
			}
			System.out.println();
		} else {
			for (int i = 0; i < n; i++) {
				if (check[i] == 0) {
					check[i] = 1;
					memo[L] = arr[i];
					DFS(L + 1);
					check[i] = 0;
				}
			}
		}
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		m = kb.nextInt();
		arr = new int[n];
		memo = new int[m];
		check = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}
		T.DFS(0);
	}
}
