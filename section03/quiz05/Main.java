package section03.quiz05;

import java.util.Scanner;

public class Main {

	public int solution(int n) {
		// 방법1		
//		int answer = 0, sum = 0, lt = 0;
//		int m = n / 2 + 1;
//		int[] arr = new int[m];
//		for(int i = 0; i < m; i++) arr[i] = i + 1;
//		for(int rt = 0; rt < m; rt++) {
//			sum += arr[rt];
//			if(sum == n) answer++;
//			while(sum >= n) {
//				sum -= arr[lt++];
//				if(sum == n) answer++;
//			}
//		}
//		return answer;
		
		// 방법2
		int answer = 0, cnt = 1;
		n--;
		while(n > 0) {
			cnt++;
			n = n - cnt;
			if(n % cnt == 0) answer++;
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		System.out.print(T.solution(n));	
	}

}
