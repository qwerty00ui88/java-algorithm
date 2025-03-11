package section04.quiz02;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public String solution(String str1, String str2) {
		String answer = "YES";
		HashMap<Character, Integer> map = new HashMap<>();
		for (char x : str1.toCharArray()) {
			map.put(x, map.getOrDefault(x, 0) + 1);
		}
		for (char y : str2.toCharArray()) {
			if (map.containsKey(y) == false || map.get(y) == 0) {
				return "NO";
			}
			map.put(y, map.get(y) - 1);
		}
		return answer;
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str1 = kb.next();
		String str2 = kb.next();
		System.out.print(T.solution(str1, str2));
	}
}
