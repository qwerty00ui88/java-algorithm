package section08.quiz13;

import java.util.Scanner;

class MainDfs {
	static int n, answer;
	static int[][] board;
	static int[] dx = { -1, -1, 0, 1, 1, 1, 0, -1 };
	static int[] dy = { 0, 1, 1, 1, 0, -1, -1, -1 };

	public void DFS(int x, int y) {
		for (int i = 0; i < 8; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			if (nx >= 0 && nx < n && ny >= 0 && ny < n && board[nx][ny] == 1) {
				board[nx][ny] = 0;
				DFS(nx, ny);
			}
		}
	}

	public static void main(String[] args) {
		MainDfs T = new MainDfs();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		board = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				board[i][j] = kb.nextInt();
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (board[i][j] == 1) {
					answer++;
					board[i][j] = 0;
					T.DFS(i, j);
				}
			}
		}
		System.out.print(answer);
	}

}