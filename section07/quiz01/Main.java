package section07.quiz01;

import java.util.Scanner;

public class Main {
	public void DFS(int n) {
		if (n == 0) {
			return;
		} else {
			DFS(n - 1);
			System.out.print(n + " ");
		}
	}

	public void solution(int n) {
		DFS(n);
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		T.solution(n);
	}

}
