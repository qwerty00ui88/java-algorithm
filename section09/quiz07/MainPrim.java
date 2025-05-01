package section09.quiz07;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

class Edge2 implements Comparable<Edge2> {
	public int vex, cost;

	Edge2(int vex, int cost) {
		this.vex = vex;
		this.cost = cost;
	}

	@Override
	public int compareTo(Edge2 ob) {
		return this.cost - ob.cost;
	}

}

public class MainPrim {
	static int[] ch;

	public int solution(int v, int e, ArrayList<ArrayList<Edge2>> graph) {
		int answer = 0;
		PriorityQueue<Edge2> pQ = new PriorityQueue<>();
		pQ.offer(new Edge2(1, 0));
		while (!pQ.isEmpty()) {
			Edge2 tmp = pQ.poll();
			int ev = tmp.vex;
			if (ch[ev] == 0) {
				ch[ev] = 1;
				answer += tmp.cost;
				for (Edge2 ob : graph.get(ev)) {
					if (ch[ob.vex] == 0) {
						pQ.offer(new Edge2(ob.vex, ob.cost));
					}
				}
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		MainPrim T = new MainPrim();
		Scanner kb = new Scanner(System.in);
		int v = kb.nextInt();
		int e = kb.nextInt();
		ArrayList<ArrayList<Edge2>> graph = new ArrayList<ArrayList<Edge2>>();
		for (int i = 0; i <= v; i++) {
			graph.add(new ArrayList<Edge2>());
		}
		ch = new int[v + 1];
		for (int i = 0; i < e; i++) {
			int a = kb.nextInt();
			int b = kb.nextInt();
			int c = kb.nextInt();
			graph.get(a).add(new Edge2(b, c));
			graph.get(b).add(new Edge2(a, c));
		}
		System.out.print(T.solution(v, e, graph));
	}
}
