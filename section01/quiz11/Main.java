package section01.quiz11;

import java.util.Scanner;

public class Main {
	public String solution(String str) {
		String answer = "";
		str = str + " ";
		int count = 1;
		for(int i = 0; i < str.length() - 1; i++) {
			// 알파벳과 c가 같은 경우 : +1
			// 다른 경우 : 알파벳 변경, count = 1
			if(str.charAt(i) == str.charAt(i + 1)) {
				count++;
			} else {
				answer += str.charAt(i);
				if(count > 1) answer += String.valueOf(count);
				count = 1;
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