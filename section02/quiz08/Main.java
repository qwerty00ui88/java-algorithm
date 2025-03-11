package section02.quiz08;

import java.util.Scanner;

public class Main {

	public int[] solution(int n, int[] arr) {
		int[] answer = new int[n];
		for (int i = 0; i < n; i++) {
			int cnt = 0;
			for (int j = 0; j < n; j++) {
				if (arr[i] < arr[j])
					cnt++;
			}
			answer[i] = cnt + 1;
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
		for (int i : T.solution(n, arr)) {
			System.out.print(i + " ");
		}
	}
}