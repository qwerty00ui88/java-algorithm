package section07.quiz04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public ArrayList<Integer> DFS(ArrayList<Integer> memo, int n) {
		int l = memo.size();
		if (l >= n) {
			return memo;
		} else {
			memo.add(memo.get(l - 2) + memo.get(l - 1));
			return DFS(memo, n);
		}
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		ArrayList<Integer> memo = new ArrayList<Integer>(Arrays.asList(1, 1));
		for (int i : T.DFS(memo, n)) {
			System.out.print(i + " ");
		}
	}

}
