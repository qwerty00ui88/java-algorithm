package section03.quiz06;

import java.util.Scanner;

//14 2
//1 1 0 0 1 1 0 1 1 0 1 1 0 1
public class Main {
	public int solution(int n, int k, int[] arr) {
		int answer = 0;
		int lt = 0, cnt = 0;
		for (int rt = 0; rt < n; rt++) {
			if (arr[rt] == 0)
				cnt++;
			while (cnt > k) {
				if (arr[lt] == 0) {
					cnt--;
				}
				lt++;
			}
			answer = Math.max(rt - lt + 1, answer);
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