package section01.quiz09;

import java.util.Scanner;

public class Main {

	// 방법1
	public int solution(String s) {
		int answer = 0;
		for(char x : s.toCharArray()) {
			if(x >= 48 && x <= 57) answer = answer * 10 + (x - 48);
		}
		return answer;
	}
	
//	// 방법2
//	public int solution(String s) {
//		String answer = "";
//		for(char x : s.toCharArray()) {
//			if(Character.isDigit(x)) answer += x;
//		}
//		return Integer.valueOf(answer);
//	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.print(T.solution(str));
	}

}
