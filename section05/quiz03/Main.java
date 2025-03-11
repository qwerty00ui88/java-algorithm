package section05.quiz03;

import java.util.Scanner;
import java.util.Stack;

public class Main {

	public int solution(int n, int[][] board, int m, int[] moves) {
		int answer = 0;
		Stack<Integer> stack = new Stack<>();
		for (int i : moves) {
			int colIdx = i - 1;
			int rowIdx = 0;
			int doll = 0;
			while (rowIdx < n - 1 && board[rowIdx][colIdx] == 0) {
				rowIdx++;
			}
			
			doll = board[rowIdx][colIdx];
			board[rowIdx][colIdx] = 0;

			if (stack.isEmpty() == false && stack.peek() == doll) {
				stack.pop();
				answer += 2;
			} else {
				stack.push(doll);
			}

		}
		return answer;
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[][] board = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				board[i][j] = kb.nextInt();
			}
		}
		int m = kb.nextInt();
		int[] moves = new int[m];
		for (int i = 0; i < m; i++) {
			moves[i] = kb.nextInt();
		}
		System.out.print(T.solution(n, board, m, moves));
	}

}
