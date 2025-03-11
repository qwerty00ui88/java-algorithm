package section04.quiz01;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public char solution(int n, String str) {
		char answer = ' ';
		HashMap<Character, Integer> map = new HashMap<>();
		for (char c : str.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}

		int max = Integer.MIN_VALUE;
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (max < entry.getValue()) {
				max = entry.getValue();
				answer = entry.getKey();
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		String str = kb.next();
		System.out.print(T.solution(n, str));
	}
}