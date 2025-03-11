package section01.quiz03;

import java.util.Scanner;

public class Main {

//	public String solution(String str) {
//		String answer = "";
//		int max = Integer.MIN_VALUE;
//		String[] words = str.split(" ");
//		for(String w : words) {
//			int l = w.length();
//			if(max < l) {
//				max = l;
//				answer = w;
//			}
//		}
//		return answer;
//	}

	public String solution(String str) {
		String answer = "";
		int max = Integer.MIN_VALUE, pos;
		while (str.indexOf(" ") != -1) {
			pos = str.indexOf(" ");
			String word = str.substring(0, pos);
			int l = word.length();
			if (max < l) {
				max = l;
				answer = word;
			}
			str = str.substring(pos + 1);
		}
		if (str.length() > max)
			answer = str;
		return answer;
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		System.out.print(T.solution(str));
	}

}