package section08.quiz10;

import java.util.Scanner;

public class Main {
	static int[][] arr;
	static int[][] ch = new int[7][7];
	static int answer = 0;
	static int[][] p = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };

	public void DFS(int x, int y) {
		if (x == 6 && y == 6) {
			answer++;
		} else {
			for (int[] next : p) {
				int nx = x + next[0];
				int ny = y + next[1];
//				System.out.print(nx);

				if (nx < 0 || nx > 6 || ny < 0 || ny > 6) {
					continue;
				}

				if (ch[nx][ny] == 0 && arr[nx][ny] == 0) {
					ch[nx][ny] = 1;
					DFS(nx, ny);
					ch[nx][ny] = 0;
				}
			}
		}
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		arr = new int[7][7];
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 7; j++) {
				arr[i][j] = kb.nextInt();
			}
		}
		ch[0][0] = 1;
		T.DFS(0, 0);
		System.out.print(answer);
	}
}
