package section06.quiz01;

import java.util.Scanner;

public class Main {

	public int[] solution(int n, int[] arr) {
		for (int i = 0; i < n - 1; i++) { // 넣을 칸
			// 최소 인덱스 찾기
			int minIdx = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[minIdx] > arr[j]) {
					minIdx = j;
				}
			}
			
			// 스왑
			int tmp = arr[i];
			arr[i] = arr[minIdx];
			arr[minIdx] = tmp;
		}
		return arr;
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
