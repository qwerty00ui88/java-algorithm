package section03.quiz03;

import java.util.Scanner;

//10 3
//12 15 11 20 25 10 20 19 13 15
public class Main {
	public int solution(int n, int k, int[] arr) {
		int answer, sum = 0;
		for (int i = 0; i < k; i++) {
			sum += arr[i];
		}
		answer = sum;

		// 윈도우 밀기
		for (int i = k; i < n; i++) {
			sum += (arr[i] - arr[i - k]);
			answer = Math.max(sum, answer);
		}
		return answer;
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int k = kb.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}
		System.out.print(T.solution(n, k, arr));
	}
}