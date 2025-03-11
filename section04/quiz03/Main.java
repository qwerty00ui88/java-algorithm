package section04.quiz03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public ArrayList<Integer> solution(int n, int k, int[] arr) {
		// n일의 매출액을 1, 2, 3, 4, 5, 6, 7
		// k만큼 끊어서 2
		// 중복을 제거한 수를 담은 배열 출력
		ArrayList<Integer> answer = new ArrayList<>();
		HashMap<Integer, Integer> HM = new HashMap<>();
		for (int i = 0; i < k - 1; i++) {
			HM.put(arr[i], HM.getOrDefault(arr[i], 0) + 1);
		}
		int lt = 0;
		for (int rt = k - 1; rt < n; rt++) {
			HM.put(arr[rt], HM.getOrDefault(arr[rt], 0) + 1);
			answer.add(HM.size());
			HM.put(arr[lt], HM.get(arr[lt]) - 1);
			if (HM.get(arr[lt]) == 0) {
				HM.remove(arr[lt]);
			}
			lt++;
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
		for (int i : T.solution(n, k, arr)) {
			System.out.print(i + " ");
		}
	}

}
