package section10.quiz05;

import java.util.Arrays;
import java.util.Scanner;

class Main{
	static int n, m;
	static int[] dy;
	public int solution(int[] coin){
		Arrays.fill(dy, Integer.MAX_VALUE);
		dy[0] = 0;
		for(int c : coin) {
			for(int i = c; i < dy.length; i++) {
				dy[i] = Math.min(dy[i], dy[i - c] + 1);
			}
		}
		return dy[dy.length - 1];
	}

	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++){
			arr[i]=kb.nextInt();
		}
		m = kb.nextInt();
		dy=new int[m + 1];
		System.out.print(T.solution(arr));
	}
}
