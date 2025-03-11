package section02.quiz05;

import java.util.Scanner;

public class Main {
	public int solution(int n) {
		int answer = 0;
		int[] arr = new int[n + 1];
		for (int i = 2; i <= n; i++) {
			if (arr[i] == 0) {
				answer++;
				for (int j = i; j <= n; j += i) {
					arr[i] = 1;
				}
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		System.out.print(T.solution(n));
	}
}