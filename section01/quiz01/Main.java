package section01.quiz01;

import java.util.Scanner;

public class Main {

//	Computercooler
//	c
	public int solution(String str, char c) {
		int answer = 0;
		str = str.toUpperCase();
		c = Character.toUpperCase(c);
		for (char x : str.toCharArray()) {
			if (c == x) {
				answer++;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		char c = kb.next().charAt(0);
		System.out.print(T.solution(str, c));
	}

}
