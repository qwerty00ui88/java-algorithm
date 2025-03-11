package section02.quiz06;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
//	public ArrayList<Integer> solution(int n, int[] arr) {
//		ArrayList<Integer> answer = new ArrayList<>();
//		// 뒤집기 -> 소수이면 출력(첫 자리 0은 무시)
//		for (int i : arr) {
//			int tmp = Integer.valueOf(new StringBuilder(String.valueOf(i)).reverse().toString());
//			if (isPrime(tmp)) {
//				answer.add(tmp);
//			}
//		}
//		return answer;
//	}

	public ArrayList<Integer> solution(int n, int[] arr) {
		ArrayList<Integer> answer = new ArrayList<>();
		// 뒤집기 -> 소수이면 출력(첫 자리 0은 무시)
		for (int i : arr) {
			int tmp = i;
			int reverse = 0;
			while (tmp > 0) {
				int last = tmp % 10;
				reverse = (reverse * 10) + last;
				tmp = tmp / 10;
			}
			if (isPrime(reverse)) {
				answer.add(reverse);
			}
		}
		return answer;
	}

	public boolean isPrime(int n) {
		boolean answer = true;
		if (n == 1) {
			answer = false;
		} else {
			for (int i = 2; i < n; i++) {
				if (n % i == 0) {
					answer = false;
					break;
				}
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
		for (int i : T.solution(n, arr)) {
			System.out.print(i + " ");
		}
	}
}