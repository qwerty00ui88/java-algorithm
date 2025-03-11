package section01.quiz04;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

//	public ArrayList<String> solution(int n, String[] words) {
//		ArrayList<String> answer = new ArrayList<>();
//		for(String word : words) {
//			String tmp = new StringBuilder(word).reverse().toString();
//			answer.add(tmp);
//		}
//		return answer;
//	}

	public ArrayList<String> solution(int n, String[] words) {
		ArrayList<String> answer = new ArrayList<>();
		for (String w : words) {
			StringBuilder str = new StringBuilder(w).reverse();
			answer.add(str.toString());
		}
		return answer;
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		kb.nextLine();
		String[] words = new String[n];
		for (int i = 0; i < n; i++) {
			words[i] = kb.next();
		}
		for (String word : T.solution(n, words)) {
			System.out.println(word);
		}
	}
}