package section01.quiz07;

import java.util.Scanner;

public class Main {
//	public String solution(String str) {
//		String answer = "YES";
//		int lt = 0, rt = str.length() - 1;
//		char[] s = str.toUpperCase().toCharArray();
//		while (lt < rt) {
//			if (s[lt] != s[rt]) {
//				answer = "NO";
//				break;
//			}
//			lt++;
//			rt--;
//		}
//		return answer;
//	}

	public String solution(String str) {
		String tmp = new StringBuilder(str).reverse().toString();
		return str.equalsIgnoreCase(tmp) ? "YES" : "NO";
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.print(T.solution(str));
	}
}