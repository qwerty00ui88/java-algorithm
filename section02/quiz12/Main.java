package section02.quiz12;

import java.util.Scanner;

//4 3
//3 4 1 2
//4 3 2 1
//3 1 4 2
public class Main {

	public int solution(int n, int m, int[][] arr) {
		int answer = 0;
		// n : 학생 수, m : 시험 횟수
		int[][] tmp = new int[n][n];
		for (int i = 0; i < m; i++) { // 시험 횟수
			for (int j = 0; j < n; j++) { // 학생 수
				for (int k = j; k < n; k++) { // 나보다 등수 낮은 학생
					int me = arr[i][j] - 1;
					int you = arr[i][k] - 1;
					tmp[me][you] = 1;
				}
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (tmp[i][j] == 0) {
					answer++;
				}
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int m = kb.nextInt();
		int[][] arr = new int[m][n];
		for (int i = 0; i < m; i++) { // 시험 횟수
			for (int j = 0; j < n; j++) { // 학생 수
				arr[i][j] = kb.nextInt();
			}
		}
		System.out.print(T.solution(n, m, arr));
	}
}