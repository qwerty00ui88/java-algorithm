package section07.quiz09;

import java.util.LinkedList;
import java.util.Queue;

class Node {
	int data;
	Node lt, rt;

	public Node(int val) {
		this.data = val;
		this.lt = null;
		this.rt = null;
	}
}

public class Main {
	Node root;

	// 완전한 자식이 있어야 성립
//	public int DFS(int L, Node root) {
//		if (root.lt == null && root.rt == null)
//			return L;
//		else
//			return Math.min(DFS(L + 1, root.lt), DFS(L + 1, root.rt));
//	}

	public int BFS(Node root) {
		Queue<Node> Q = new LinkedList<>();
		Q.offer(root);
		int L = 0;
		while (!Q.isEmpty()) {
			int len = Q.size();
			for (int i = 0; i < len; i++) {
				Node cur = Q.poll();
				if (cur.lt == null && cur.rt == null)
					return L;
				if (cur.lt != null)
					Q.offer(cur.lt);
				if (cur.rt != null)
					Q.offer(cur.rt);
			}
			L++;
		}
		return 0;
	}

	public static void main(String[] args) {
		Main tree = new Main();
		tree.root = new Node(1);
		tree.root.lt = new Node(2);
		tree.root.rt = new Node(3);
		tree.root.lt.lt = new Node(4);
		tree.root.lt.rt = new Node(5);
//		System.out.println(tree.DFS(0, tree.root));
		System.out.println(tree.BFS(tree.root));
	}

}
