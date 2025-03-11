package section07.quiz02;

import java.util.Scanner;

public class Main {

	public void DFS(int n) {
		// 몫과 나머지를 구한다
		// 처음 나오는 나머지가 맨 뒤(함수 출력 먼저, 출력 나중에)
		if (n == 0) {
			return;
		}
		DFS(n / 2);
		System.out.print(n % 2);
	}

	public void solution(int n) {
		DFS(n);
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		T.solution(n);
	}

}
