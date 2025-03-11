package section02.quiz03;

import java.util.Scanner;

public class Main {
	public String[] solution(int n, int[] arrA, int[] arrB) {
		String[] answer = new String[n];
		// 1:가위, 2:바위, 3:보
		// 1이 이기는 경우 : 3
		// 2가 이기는 경우 : 1
		// 3이 이기는 경우 : 2
		for (int i = 0; i < n; i++) {
			if (arrA[i] == arrB[i]) {
				answer[i] = "D";
			} else if ((arrA[i] == 1 && arrB[i] == 3) || (arrA[i] == 2 && arrB[i] == 1)
					|| (arrA[i] == 3 && arrB[i] == 2)) {
				answer[i] = "A";
			} else {
				answer[i] = "B";
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arrA = new int[n];
		for (int i = 0; i < n; i++) {
			arrA[i] = kb.nextInt();
		}
		int[] arrB = new int[n];
		for (int i = 0; i < n; i++) {
			arrB[i] = kb.nextInt();
		}
		for (String i : T.solution(n, arrA, arrB)) {
			System.out.println(i);
		}
	}
}