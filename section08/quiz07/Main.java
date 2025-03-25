package section08.quiz07;

import java.util.Scanner;

// 순열 : P, 순서 다르면 다르게 취급
// 조합 : C, 순서 달라도 같게 취급
public class Main {
	// 3C2 = 2C1 + 2C2
	// = (1C0 + 1C1) + (1C1 + 1C2)
	// = (1 + 1) + (1 + 0)
	int[][] memo = new int[35][35];

	public int solution(int n, int r) {
		if (memo[n][r] > 0) {
			return memo[n][r];
		}
		if (r == 0 || n == r) {
			return 1;
		} else {
			return memo[n][r] = solution(n - 1, r - 1) + solution(n - 1, r);
		}
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int r = kb.nextInt();
		System.out.print(T.solution(n, r));
	}

}
