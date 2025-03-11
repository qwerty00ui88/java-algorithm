package section06.quiz10;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

//	5 3
//	1 2 8 4 9
	public int count(int[] xi, int mid) {
		int cnt = 1;
		int ep = xi[0];
		for (int i : xi) {
			if (i - ep >= mid) {
				cnt++;
				ep = i;
			}
		}
		return cnt;
	}

	public int solution(int n, int c, int[] xi) {
		int answer = 0;
		Arrays.sort(xi);
		int lt = 1;
		int rt = xi[n - 1];
		while (lt <= rt) {
			int mid = (lt + rt) / 2;
			if (count(xi, mid) >= c) {
				answer = mid;
				lt = mid + 1;
			} else {
				rt = mid - 1;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int c = kb.nextInt();
		int[] xi = new int[n];
		for (int i = 0; i < n; i++) {
			xi[i] = kb.nextInt();
		}
		System.out.print(T.solution(n, c, xi));
	}

}
