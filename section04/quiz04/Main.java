package section04.quiz04;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public int solution(String s, String t) {
//		bacaAacba
//		abc
		int answer = 0;
		HashMap<Character, Integer> sMap = new HashMap<>();
		HashMap<Character, Integer> tMap = new HashMap<>();
		char[] sArr = s.toCharArray();
		for (int i = 0; i < t.length() - 1; i++) {
			sMap.put(sArr[i], sMap.getOrDefault(sArr[i], 0) + 1);
		}
		for (char c : t.toCharArray()) {
			tMap.put(c, tMap.getOrDefault(c, 0) + 1);
		}
		int lt = 0;
		for (int rt = t.length() - 1; rt < s.length(); rt++) {
			sMap.put(sArr[rt], sMap.getOrDefault(sArr[rt], 0) + 1);
			if (sMap.equals(tMap)) {
				answer++;
			}
			sMap.put(sArr[lt], sMap.get(sArr[lt]) - 1);
			if (sMap.get(sArr[lt]) == 0) {
				sMap.remove(sArr[lt]);
			}
			lt++;
		}
		return answer;
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String s = kb.next();
		String t = kb.next();
		System.out.print(T.solution(s, t));
	}

}
