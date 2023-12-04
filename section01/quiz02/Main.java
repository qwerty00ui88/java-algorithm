package section01.quiz02;

import java.util.Scanner;

public class Main {

	public String solution(String str) {
		String answer = "";
		
//		// 방법1
//		for(char x : str.toCharArray()) {
//			if(Character.isLowerCase(x)) answer += Character.toUpperCase(x);
//			else answer += Character.toLowerCase(x);
//		}
		
		// 방법2
		// ASCII code -> 대문자와 소문자의 차이는 32
		// 대문자: 65 ~ 90
		// 소문자: 97 ~ 122
		for(char x : str.toCharArray()) {
			if(x >= 97 && x <=122) answer += (char)(x - 32);
			else answer += (char)(x + 32);
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
