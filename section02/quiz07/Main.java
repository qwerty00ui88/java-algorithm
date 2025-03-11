package section02.quiz07;

import java.util.Scanner;

public class Main {
	public int solution(int n, int[] arr) {
		// 맨 앞의 문제 or 틀린 후 맞은 문제 -> 1
		int answer = 0;
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] == 1) {
				count++;
				answer += count;
			} else {
				count = 0;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}
		System.out.print(T.solution(n, arr));
	}
}
