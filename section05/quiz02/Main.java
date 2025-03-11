package section05.quiz02;

import java.util.Scanner;
import java.util.Stack;

public class Main {

	// (A(BC)D)EF(G(H)(IJ)K)LM(N)
	public String solution(String str) {
		String answer = "";
		Stack<Character> stack = new Stack<>();
		for (char c : str.toCharArray()) {
			if (c == ')') {
				while (stack.pop() != '(');
			} else {
				stack.push(c);
			}
		}
		for (char c : stack) {
			answer += c;
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
