package section02.quiz02;

import java.util.Scanner;

public class Main {

	public int solution(int n, int[] arr) {
		int answer = 1;
		int max = arr[0];
		for (int i = 1; i < n; i++) {
			// i 이전의 모든 값이 i보다 작으면 +1
			if (max < arr[i]) {
				answer++;
				max = arr[i];
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