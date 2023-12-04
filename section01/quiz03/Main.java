package section01.quiz03;

import java.util.Scanner;

public class Main {
	
	public String solution(String str) {
		String[] word = str.split(" ");
		String answer = word[0];
		for(int i = 1; i < word.length; i++) {
			if(word[i].length() > answer.length()) answer = word[i];
		}
		return answer;
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		System.out.print(T.solution(str));
	}

}
