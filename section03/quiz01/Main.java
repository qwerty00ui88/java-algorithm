package section03.quiz01;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

//	public int[] solution(int n, int[] arr1, int m, int[] arr2) {
//		int[] answer = new int[n + m];
//		int p1 = 0, p2 = 0;
//		for (int i = 0; i < n + m; i++) {
//			if (p1 < arr1.length && (p2 >= arr2.length || arr1[p1] <= arr2[p2])) {
//				answer[i] = arr1[p1];
//				p1++;
//			} else if (p2 < arr2.length && (p1 >= arr1.length || arr1[p1] > arr2[p2])) {
//				answer[i] = arr2[p2];
//				p2++;
//			}
//		}
//		return answer;
//	}

	public ArrayList<Integer> solution(int n, int[] arr1, int m, int[] arr2) {
		ArrayList<Integer> answer = new ArrayList<>();
		int p1 = 0, p2 = 0;
		while (p1 < n && p2 < m) {
			if (arr1[p1] < arr2[p2]) {
				answer.add(arr1[p1++]);
			} else {
				answer.add(arr2[p2++]);
			}
		}
		while (p1 < n) {
			answer.add(arr1[p1++]);

		}
		while (p2 < m) {
			answer.add(arr2[p2++]);
		}
		return answer;
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr1 = new int[n];
		for (int i = 0; i < n; i++) {
			arr1[i] = kb.nextInt();
		}
		int m = kb.nextInt();
		int[] arr2 = new int[m];
		for (int i = 0; i < m; i++) {
			arr2[i] = kb.nextInt();
		}
		for (int i : T.solution(n, arr1, m, arr2)) {
			System.out.print(i + " ");
		}
	}
}