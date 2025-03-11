package section06.quiz05;

import java.util.HashSet;
import java.util.Scanner;

//8
//20 25 52 30 39 33 43 33
public class Main {

//	public char solution(int n, int[] arr) {
//		char answer = 'U';
//		Arrays.sort(arr);
//		for (int i = 1; i < n; i++) {
//			if (arr[i - 1] == arr[i]) {
//				answer = 'D';
//				break;
//			}
//		}
//		return answer;
//	}

	public char solution(int n, int[] arr) {
		char answer = 'U';
		HashSet<Integer> hs = new HashSet<>();
		for (int i = 0; i < n; i++) {
			hs.add(arr[i]);
		}
		if (hs.size() != arr.length) {
			answer = 'D';
		}
		return answer;
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}
		System.out.print(T.solution(n, arr));
	}

}
