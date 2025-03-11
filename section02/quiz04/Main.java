package section02.quiz04;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public ArrayList<Integer> solution(int n) {
		ArrayList<Integer> answer = new ArrayList<>();
		answer.add(1);
		answer.add(1);
		int l = answer.size();
		while (n > l) {
			answer.add(answer.get(l - 2) + answer.get(l - 1));
			l++;
		}
		return answer;
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		for (int i : T.solution(n)) {
			System.out.print(i + " ");
		}

	}
}