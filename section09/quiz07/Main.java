package section09.quiz07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Edge implements Comparable<Edge> {
	public int v1, v2, cost;

	Edge(int v1, int v2, int cost) {
		this.v1 = v1;
		this.v2 = v2;
		this.cost = cost;
	}

	@Override
	public int compareTo(Edge ob) {
		return this.cost - ob.cost;
	}

}

public class Main {
	static int[] unf;

	public static int Find(int v) {
		if (v == unf[v])
			return v;
		else
			return unf[v] = Find(unf[v]);
	}

	public static void Union(int a, int b) {
		int fa = Find(a);
		int fb = Find(b);
		if (fa != fb)
			unf[fa] = fb;
	}

	public int solution(int v, int e, ArrayList<Edge> arr) {
		int answer = 0;
		int cnt = 0;
		Collections.sort(arr);
		for (Edge ob : arr) {
			if (cnt == v - 1) {
				break;
			}
			int fv1 = Find(ob.v1);
			int fv2 = Find(ob.v2);
			if (fv1 != fv2) {
				answer += ob.cost;
				Union(ob.v1, ob.v2);
				cnt++;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int v = kb.nextInt();
		int e = kb.nextInt();
		unf = new int[v + 1];
		ArrayList<Edge> arr = new ArrayList<>();
		for (int i = 1; i <= v; i++) {
			unf[i] = i;
		}
		for (int i = 0; i < e; i++) {
			int v1 = kb.nextInt();
			int v2 = kb.nextInt();
			int cost = kb.nextInt();
			arr.add(new Edge(v1, v2, cost));
		}
		System.out.print(T.solution(v, e, arr));
	}
}
