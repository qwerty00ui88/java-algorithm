package section07.quiz03;

import java.util.Scanner;

public class Main {

	public int DFS(int n) {
		if (n == 1) {
			return n;
		} else {
			return n * DFS(n - 1);
		}
	}

	public int solution(int n) {
		return DFS(n);
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		System.out.print(T.solution(n));
	}

}
