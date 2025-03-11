package section06.quiz06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	// 철수 짝궁
//	9
//	120 125 152 130 135 135 143 127 160
	public ArrayList<Integer> solution(int n, int[] arr) {
		ArrayList<Integer> answer = new ArrayList<>();
		int[] tmp = arr.clone();
		Arrays.sort(tmp);
		for (int i = 0; i < n; i++) {
			if (arr[i] != tmp[i]) {
				answer.add(i + 1);
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
