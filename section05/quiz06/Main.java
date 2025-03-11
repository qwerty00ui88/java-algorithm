package section05.quiz06;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public int solution(int n, int k) {
		// 8 3
		// 1 2 3 4 5 6 7 8
		int answer = 0;
		Queue<Integer> queue = new LinkedList<>();
		for (int i = 1; i <= n; i++) {
			queue.offer(i);
		}
		while (queue.size() > 1) {
			for (int i = 0; i < k; i++) {
				if (i < k - 1) {
					queue.offer(queue.poll());
				} else {
					queue.poll();
				}

			}
		}
		answer = queue.poll();
		return answer;
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int k = kb.nextInt();
		System.out.print(T.solution(n, k));
	}

}
