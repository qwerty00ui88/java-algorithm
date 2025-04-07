package section08.quiz14;

import java.util.ArrayList;
import java.util.Scanner;

class Point {
	int x, y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

// 답 : 도시의 최소 피자배달거리
// M개의 피자집 선택
// 도시의 피자배달거리 구히기
// 최소값인지 확인 & 출력
public class Main {
	static int n, m, len, answer = Integer.MAX_VALUE;
	static int[] combi;
	static ArrayList<Point> hs, pz;

	public void DFS(int L, int s) {
		if (L == m) {
			int sum = 0;
			for (Point h : hs) {
				int dis = Integer.MAX_VALUE;
				for (int i : combi) {
					dis = Math.min(dis, Math.abs(h.x - pz.get(i).x) + Math.abs(h.y - pz.get(i).y));
				}
				sum += dis;
			}
			answer = Math.min(answer, sum);
		} else {
			for (int i = s; i < len; i++) {
				combi[L] = i;
				DFS(L + 1, i + 1);
			}
		}
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		m = kb.nextInt();
		hs = new ArrayList<>();
		pz = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				int tmp = kb.nextInt();
				if (tmp == 1)
					hs.add(new Point(i, j));
				else if (tmp == 2)
					pz.add(new Point(i, j));
			}
		}
		len = pz.size();
		combi = new int[m];
		T.DFS(0, 0);
		System.out.print(answer);
	}

}