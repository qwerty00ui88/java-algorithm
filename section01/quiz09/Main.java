package section01.quiz09;

import java.util.Scanner;

public class Main {
//	public int solution(String str) {
//		str = str.replaceAll("[^0-9]", "");
//		return Integer.valueOf(str);
//	}

	public int solution(String str) {
		int answer = 0;
		for (char c : str.toCharArray()) {
			if (c >= 48 && c <= 57) {
				answer = (answer * 10) + (c - 48);
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.print(T.solution(str));
	}
}