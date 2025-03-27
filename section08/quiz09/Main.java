package section08.quiz09;

import java.util.Scanner;

public class Main {
	static int n, m;
	static int[] combi;

	public void DFS(int L, int start) {
		if (L == m) {
			for (int i = 0; i < m; i++) {
				System.out.print(combi[i] + " ");
			}
			System.out.println();
		} else {
			for (int i = start; i <= n; i++) {
				combi[L] = i;
				DFS(L + 1, i + 1);
			}
		}
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		m = kb.nextInt();
		combi = new int[m];
		T.DFS(0, 1);
	}
}
