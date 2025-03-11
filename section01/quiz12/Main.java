package section01.quiz12;

import java.util.Scanner;

public class Main {
	public String solution(int n, String str) {
		String answer = "";
		// 7개씩 나누기 -> 숫자로 대체 -> 이진수로 변환 -> 아스키코드 조회
		for (int i = 0; i < str.length(); i += 7) {
			String tmp = str.substring(i, i + 7);
			tmp = tmp.replaceAll("#", "1").replaceAll("\\*", "0");
			answer += (char) Integer.parseInt(tmp, 2);
		}
		return answer;
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		String str = kb.next();
		System.out.print(T.solution(n, str));
	}
}