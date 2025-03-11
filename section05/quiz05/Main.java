package section05.quiz05;

import java.util.Scanner;
import java.util.Stack;

public class Main {

	public int solution(String str) {
		int answer = 0;
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < str.length(); i++) {
			char x = str.charAt(i);
			if (x == '(') {
				stack.push(x);
			} else if (x == ')' && str.charAt(i - 1) == '(') { // 레이저인 경우
				stack.pop();
				answer += stack.size();
			} else { // 막대기 끝인 경우
				stack.pop();
				answer += 1;
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
