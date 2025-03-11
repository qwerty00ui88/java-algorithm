package section05.quiz07;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//CBA
//CBDAGE
public class Main {
	public String solution(String str1, String str2) {
		String answer = "YES";
		Queue<Character> queue = new LinkedList<>();
		for (char x : str1.toCharArray()) {
			queue.offer(x);
		}
		for (char y : str2.toCharArray()) {
			if (queue.contains(y)) {
				if (queue.poll() != y) {
					return "NO";
				}
			}
		}
		if (queue.isEmpty() == false) {
			return "NO";
		}
		return answer;
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str1 = kb.next();
		String str2 = kb.next();
		System.out.print(T.solution(str1, str2));
	}
}
