package section04.quiz05;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

//	10 3
//	13 15 34 23 45 65 33 11 26 42
	public int solution(int n, int k, int[] arr) {
		int answer = -1;
		// 3장씩 뽑기
		// 합 구하기
		// 합 중 k번째로 큰 값 출력
		TreeSet<Integer> tSet = new TreeSet<>(Collections.reverseOrder());
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				for (int l = j + 1; l < n; l++) {
					tSet.add(arr[i] + arr[j] + arr[l]);
				}
			}
		}
		int cnt = 0;
		for (int i : tSet) {
			cnt++;
			if (cnt == k) {
				answer = i;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int k = kb.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}
		System.out.print(T.solution(n, k, arr));
	}

}
